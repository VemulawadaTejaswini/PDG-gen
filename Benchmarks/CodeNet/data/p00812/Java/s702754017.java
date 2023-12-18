import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
	public void solve() throws Exception{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String exp;
		Parser parser = new Parser();
		while(!(exp = buf.readLine()).equals(".")){
			Polynomial poly = parser.parse(exp);
			String str;
			while(!(str = buf.readLine()).equals(".")){
				Polynomial p2 = parser.parse(str);
				if(poly.compareTo(p2) == 0){
					System.out.println("yes");
				}else{
					System.out.println("no");
				}
			}
			System.out.println(".");
		}
	}
	
	public static void main(String[] args) throws Exception{
		new Main().solve();
	}
}

class Factor implements Comparable<Factor>{
	char variable;
	int pow;
	public Factor(char var, int pow){
		this.variable = var;
		this.pow = pow;
	}
	@Override
	public int compareTo(Factor o) {
		if(variable != o.variable) return Character.compare(variable, o.variable);
		else return Integer.compare(pow, o.pow);
	}
	
	public Factor copy(){
		return new Factor(variable, pow);
	}
	public String toString(){
		return variable + "^" + pow;
	}
}

class Term implements Comparable<Term>{
	ArrayList<Factor> facts;
	int num;
	
	private Term(){
		facts = new ArrayList<>();
	}
	
	public Term(int num){
		facts = new ArrayList<>();
		this.num = num;
	}
	public Term(int num, Factor fact){
		this.num = num;
		facts = new ArrayList<>();
		facts.add(fact);
	}
	
	public Term mul(Term t){
		Term ret = new Term();
		ret.num = num * t.num;
		if(ret.num == 0) return ret;
		ArrayList<Factor> tmp = new ArrayList<>(facts);
		tmp.addAll(t.facts);
		Collections.sort(tmp);
		int idx = 0;
		while(idx < tmp.size()){
			Factor f = tmp.get(idx).copy();
			idx++;
			while(idx < tmp.size() && tmp.get(idx).variable == f.variable){
				f.pow += tmp.get(idx).pow;
				idx++;
			}
			ret.facts.add(f);
		}
		return ret;
	}
	
	public Term copy(){
		Term ret = new Term(num);
		for(Factor f : facts){
			ret.facts.add(f.copy());
		}
		return ret;
	}

	@Override
	public int compareTo(Term o) {
		int idx = 0;
		while(true){
			if(idx < facts.size()&& idx < o.facts.size()){
				Factor f1 = facts.get(idx);
				Factor f2 = o.facts.get(idx);
				if(f1.variable != f2.variable) return Character.compare(f1.variable, f2.variable);
				if(f1.pow != f2.pow) return Integer.compare(f1.pow, f2.pow);
				idx++;
			}else{
				if(facts.size() == o.facts.size()){
					return 0;
				}else if(idx >= facts.size()){
					return -1;
				}else{
					return 1;
				}
			}
		}
	}
	public String toString(){
		StringBuilder build = new StringBuilder();
		build.append(num);
		for(Factor f : facts){
			build.append(" ");
			build.append(f.toString());
		}
		return build.toString();
	}
}

public class Polynomial implements Comparable<Polynomial>{
	ArrayList<Term> terms;
	private Polynomial(){
		terms = new ArrayList<>();
	}
	public Polynomial(Term t){
		this();
		if(t.num != 0){
			terms.add(t);
		}
	}
	public Polynomial add(Polynomial p){
		Polynomial ret = new Polynomial();
		ArrayList<Term> tmp = new ArrayList<>();
		tmp.addAll(terms);
		tmp.addAll(p.terms);
		Collections.sort(tmp);

		int idx = 0;
		while(idx < tmp.size()){
			Term f = tmp.get(idx).copy();
			idx++;
			while(idx < tmp.size() && tmp.get(idx).compareTo(f) == 0){
				f.num += tmp.get(idx).num;
				idx++;
			}
			if(f.num != 0){
				ret.terms.add(f);
			}
		}
		return ret;
	}
	

	public Polynomial sub(Polynomial p){
		Polynomial ret = new Polynomial();
		ArrayList<Term> tmp = new ArrayList<>();
		tmp.addAll(terms);
		for(Term t: p.terms){
			Term tt = t.copy();
			tt.num*=-1;
			tmp.add(tt);
		}
		Collections.sort(tmp);

		int idx = 0;
		while(idx < tmp.size()){
			Term f = tmp.get(idx).copy();
			idx++;
			while(idx < tmp.size() && tmp.get(idx).compareTo(f) == 0){
				f.num += tmp.get(idx).num;
				idx++;
			}

			if(f.num != 0){
				ret.terms.add(f);
			}
		}
		return ret;
	}
	
	public Polynomial mul(Polynomial p){
		Polynomial ret = new Polynomial();
		ArrayList<Term> tmp = new ArrayList<>();
		for(Term t1 : terms){
			for(Term t2 : p.terms){
				tmp.add(t1.mul(t2));
			}
		}
		Collections.sort(tmp);

		int idx = 0;
		while(idx < tmp.size()){
			Term f = tmp.get(idx).copy();
			idx++;
			while(idx < tmp.size() && tmp.get(idx).compareTo(f) == 0){
				f.num += tmp.get(idx).num;
				idx++;
			}

			if(f.num != 0){
				ret.terms.add(f);
			}
		}
		return ret;
	}
	@Override
	public int compareTo(Polynomial o) {
		int idx = 0;
		while(idx < terms.size()&& idx < o.terms.size()){
			Term f1 = terms.get(idx);
			Term f2 = o.terms.get(idx);
			int comp = f1.compareTo(f2);
			if(comp != 0) return comp;
			if(f1.num != f2.num) return Integer.compare(f1.num, f2.num);
			idx++;
		}
		if(terms.size() == o.terms.size()){
			return 0;
		}else if(idx >= terms.size()){
			return -1;
		}else{
			return 1;
		}
	}
	
	public String toString(){
		StringBuilder build = new StringBuilder();
		boolean flg = false;
		for(Term f : terms){
			if(flg) {
				build.append(" ");
				if(f.num >= 0){
					build.append("+");
				}
				
			}
			flg = true;
			build.append(f.toString());
		}
		return build.toString();
	}


}

class Parser{
	private String str;
	int idx;
	char cur;
	boolean cont;
	
	private void next(){
		do{
			nextSpace();
		}while(cont && cur == ' ');
	}
	
	private void nextSpace(){
		if(idx >= str.length()){
			cont = false;
		}else{
			cur = str.charAt(idx++);
		}
	}

	private char variable(){
		char c = cur;
		next();
		return c;
	}

	private int number(){
		int ans = cur - '0';
		nextSpace();
		while(cont && '0' <= cur && cur <= '9'){
			ans = ans * 10 + cur - '0';
			nextSpace();
		}
		if(cur == ' ') next();
		return ans;
	}

	private Polynomial F(){
		if(cur == '('){
			next();
			Polynomial e = E();
			next();
			return e;
	
		}
		Term t;
		if('0' <= cur && cur <= '9'){
			t = new Term(number());
		}else{
			int p = 1;
			char c = variable();
			if(cur == '^'){
				next();
				p = number();
			}
			t = new Term(1, new Factor(c, p));
		}
		return new Polynomial(t);
	}

	private Polynomial T(){
		Polynomial f = F();
		while(cont && cur != '+' && cur != '-' && cur != ')'){
			f = f.mul(F());
		}
		return f;
	}


	private Polynomial E(){
		Polynomial t = T();
		while(cur == '+' || cur == '-'){
			if(cur == '+'){
				next();			
				t = t.add(T());
			}else{
				next();			
				t = t.sub(T());
			}
		}
		return t;
	}
	public Polynomial parse(String str){
		this.str = str;
		this.idx = 0;
		this.cont = true;
		next();
		return E();
	}
	
	
}