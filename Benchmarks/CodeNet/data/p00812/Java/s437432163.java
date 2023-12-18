import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//Equals are Equals
public class Main{

	char[] s;
	int id;
	
	class P{
		Map<String, Integer> c;
		int c0;
		public P() {
			c = new HashMap<String, Integer>();
			c0 = 0;
		}
		boolean eq(P p){
			Set<String> set = new HashSet<String>();
			for(String t:c.keySet())if(c.get(t)==0)set.add(t);
			for(String t:set)c.remove(t);
			set = new HashSet<String>();
			for(String t:p.c.keySet())if(p.c.get(t)==0)set.add(t);
			for(String t:set)p.c.remove(t);
//			System.out.println("P1:" + this + " P2:" + p);
//			System.out.println(c.size()+" "+p.c.size() + " " + c0 + " " + p.c0);
			if(c.size()!=p.c.size()||c0!=p.c0){
//				System.out.println("DIFF22:" + c.size() + " " + p.c.size() + " " + c0 + " "  +p.c0);
				return false;
			}
			for(String t:c.keySet())if(!p.c.containsKey(t)||c.get(t).intValue()!=p.c.get(t).intValue()){
//				System.out.println("DIFF:" + c.get(t)+" "+p.c.get(t));
				return false;
			}
			return true;
		}
		P add(P p){
//			System.out.println("ADD:" + this + " " + p);
			P r = new P();
			for(String t:c.keySet()){
				if(p.c.containsKey(t))r.c.put(t, c.get(t)+p.c.get(t));
				else r.c.put(t, c.get(t));
			}
			for(String t:p.c.keySet()){
				if(!c.containsKey(t))r.c.put(t, p.c.get(t));
			}
			r.c0 = c0+p.c0;
			Set<String> set = new HashSet<String>();
			for(String t:r.c.keySet())if(r.c.get(t)==0)set.add(t);
			for(String t:set)r.c.remove(t);
//			System.out.println("R*" + r);
			return r;
		}
		P sub(P p){
//			System.out.println("SUB:" + this + " " + p);
			P r = new P();
			for(String t:c.keySet()){
				if(p.c.containsKey(t))r.c.put(t, c.get(t)-p.c.get(t));
				else r.c.put(t, c.get(t));
			}
			for(String t:p.c.keySet()){
				if(!c.containsKey(t))r.c.put(t, -p.c.get(t));
			}
			r.c0 = c0-p.c0;
			Set<String> set = new HashSet<String>();
			for(String t:r.c.keySet())if(r.c.get(t)==0)set.add(t);
			for(String t:set)r.c.remove(t);
//			System.out.println("R*" + r);
			return r;
		}
		P mul(P p){
//			System.out.println("MUL:" + this + " " + p);
			P r = new P();
			for(String s:c.keySet())for(String t:p.c.keySet()){
				char[] x = (s+t).toCharArray();
				Arrays.sort(x);
				String v = new String(x);
				if(r.c.containsKey(v))r.c.put(v, r.c.get(v)+c.get(s)*p.c.get(t));
				else r.c.put(v, c.get(s)*p.c.get(t));
			}
//			System.out.println("R1:" + r);
			for(String s:c.keySet()){
				if(r.c.containsKey(s))r.c.put(s, r.c.get(s)+p.c0*c.get(s));
				else r.c.put(s, p.c0*c.get(s));
			}
			for(String s:p.c.keySet()){
				if(r.c.containsKey(s))r.c.put(s, r.c.get(s)+c0*p.c.get(s));
				else r.c.put(s, c0*p.c.get(s));
			}
			r.c0 += c0*p.c0;
			Set<String> set = new HashSet<String>();
			for(String t:r.c.keySet())if(r.c.get(t)==0)set.add(t);
			for(String t:set)r.c.remove(t);
//			System.out.println("R*" + r);
			return r;
		}
		P pow(int k){
//			System.out.println("POW:" + this + " " + k);
			P r = new P();
			r.c0 = 1;
			while(k--!=0)r = r.mul(this);
//			System.out.println("R*" + r);
			Set<String> set = new HashSet<String>();
			for(String t:r.c.keySet())if(r.c.get(t)==0)set.add(t);
			for(String t:set)r.c.remove(t);
			return r;
		}
		@Override
		public String toString() {
			String r = "";
			for(String t:c.keySet())r+=" "+c.get(t)+t;
			r+=" "+c0;
			return r;
		}
	}
	
	char get(){
//		System.out.println(s[id]);
		return s[id++];
	}
	char next(){
		while(s[id]==' ')id++;
//		System.out.println(s[id]);
		return s[id++];
	}
	
	P exp(){
		P r = term();
		char ch = next(); 
		while(ch=='+'||ch=='-'){
//			System.out.println("CH:" + ch);
			P f = term();
//			System.out.println(f);
			if(ch=='+')r = r.add(f);
			else r = r.sub(f);
//			System.out.println("RRR:" + r);
			ch = next();
		}
		id--;
		return r;
	}
	
	P term(){
		P r = fact();
		char ch = next();
		while(Character.isDigit(ch)||Character.isLowerCase(ch)||ch=='('){
//			System.out.println("Term char:" + ch);
			id--;
			P f = fact();
//			System.out.println("F:" + f);
			r = r.mul(f);
//			System.out.println("MUL : " + r);
			ch = next();
		}
		id--;
//		System.out.println("Term end with: " + s[id]);
		return r;
	}
	
	P fact(){
		char ch = next();
//		System.out.println("INIT: " + ch);
		P r = new P();
		if(ch=='('){
			r = exp();
			next();
		}
		else if(Character.isLowerCase(ch))r.c.put(ch+"", 1);
		else if(Character.isDigit(ch)){
			int x = ch-'0';
			for(;;){
				ch = get();
				if(!Character.isDigit(ch)){
					id--;break;
				}
				x = x*10 + ch-'0';
			}
//			System.out.println("X:" + x);
			r.c0 = x;
		}
//		System.out.println("R0:" + r);
		ch = next();
		while(ch=='^'){
			int x = next()-'0';
			r = r.pow(x);
			ch = next();
		}
		id--;
//		System.out.println("Fact end with: " + s[id]);
		return r;
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			s = (sc.nextLine()+"$").toCharArray();
			if(s[0]=='.')break;
			id = 0;
			P ans = exp();
//			System.out.println("ANS:" + ans);
			for(;;){
				s = (sc.nextLine()+"$").toCharArray();
				if(s[0]=='.')break;
				id = 0;
				P p = exp();
//				System.out.println("Pol:" + p);
				System.out.println(ans.eq(p)?"yes":"no");
			}
			System.out.println(".");
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}