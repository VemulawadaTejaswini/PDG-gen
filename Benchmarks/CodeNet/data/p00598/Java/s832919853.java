import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String is;
		String[] ia;
		while((is = in.readLine()) != null){
			name = new String[5];
			set = new ArrayList<TreeSet<Integer>>();
			setu = new TreeSet<Integer>();
			for(int i = 0;i < 5; ++i){
				ia = is.split(" ");
				if(ia[0].equals("R") && ia[1].equals("0")){
					break;
				}
				name[i] = ia[0];
				TreeSet<Integer> se = new TreeSet<Integer>();
				ia = in.readLine().split(" ");
				for(int j = 0;j < ia.length; ++j){
					se.add(new Integer(Integer.parseInt(ia[j])));
					setu.add(new Integer(Integer.parseInt(ia[j])));
				}
				set.add(se);
				is = in.readLine();
			}
			is = in.readLine();
			TreeSet<Integer> ans = solve(is);
			Iterator it = ans.iterator();
			if(it.hasNext()){
				while(true){
					System.out.printf("%d",it.next());
					if(it.hasNext()){
						System.out.printf(" ");
					} else {
						break;
					}
				} System.out.println("");
			}
		}
	}
	static String[] name;
	static TreeSet<Integer> setu;
	static ArrayList<TreeSet<Integer>> set;
	static TreeSet<Integer> solve(String a){
		if(a.length() == 1){
			for(int i = 0;i < 5 && name[i] != null; ++i){
				if(a.equals(name[i])){
					return set.get(i);
				}
			}
		}
		TreeSet<Integer> x = new TreeSet<Integer>();
		boolean y = false;
		if(a.charAt(0) == '(' && a.charAt(a.length()-1) == ')'){
			a = a.substring(1,a.length()-1);
		}
		if(a.charAt(0) == 'c' && a.matches("[(].*[)]")){
			return cs(solve(a.substring(1)));
		} else if(a.charAt(0) == 'c' && a.matches("[ABCDEc]*")){
			return cs(solve(a.substring(1)));
		}
		for(int i = 0;i < a.length(); ++i){
			if(a.charAt(i) == '('){
				int c = 0;
				for(;i < a.length(); ++i){
					if(a.charAt(i) == '('){
						++c;
					} else if(a.charAt(i) == ')'){
						--c;
					} else if(c == 0){
						break;
					}
				}
			}
			if(a.charAt(i) == 'c'){
				int c = 0;
				for(;i < a.length(); ++i){
					if(a.charAt(i) == '('){
						++c;
					} else if(a.charAt(i) == ')'){
						--c;
					} else if(a.charAt(i) == 'u' ||
						  a.charAt(i) == 'i' ||
						  a.charAt(i) == 'd' ||
						  a.charAt(i) == 's'){
						if(c == 0){
							--i;
							break;
						}
					}
				}
			}
			if(a.charAt(i) == 'u'){
								TreeSet<Integer> tmp = us(solve(a.substring(0,i)),solve(a.substring(i+1)));
								return tmp;
			} else if(a.charAt(i) == 'i'){
								TreeSet<Integer> tmp = is(solve(a.substring(0,i)),solve(a.substring(i+1)));
								return tmp;
			} else if(a.charAt(i) == 'd'){
								TreeSet<Integer> tmp = ds(solve(a.substring(0,i)),solve(a.substring(i+1)));
								return tmp;
			} else if(a.charAt(i) == 's'){
								TreeSet<Integer> tmp = ss(solve(a.substring(0,i)),solve(a.substring(i+1)));
								return tmp;
			}
		}
		return new TreeSet<Integer>();
	}
	static TreeSet<Integer> cs(TreeSet<Integer> a){
		TreeSet<Integer> tmp = new TreeSet<Integer>();
		tmp.addAll(setu);
		Iterator it = a.iterator();
		while(it.hasNext()){
			tmp.remove(it.next());
		}
		return tmp;
	}
	static TreeSet<Integer> us(TreeSet<Integer> a, TreeSet<Integer> b){
		TreeSet<Integer> tmp = new TreeSet<Integer>();
		tmp.addAll(a);
		tmp.addAll(b);
		return tmp;
	}
	static TreeSet<Integer> is(TreeSet<Integer> a, TreeSet<Integer> b){
		TreeSet<Integer> tmp = new TreeSet<Integer>();
		TreeSet<Integer> tmp1 = ds(a,b);
		tmp.addAll(a);
		Iterator it = tmp1.iterator();
		while(it.hasNext()){
			tmp.remove(it.next());
		}
		return tmp;
	}
	static TreeSet<Integer> ds(TreeSet<Integer> a, TreeSet<Integer> b){
		TreeSet<Integer> tmp = new TreeSet<Integer>();
		tmp.addAll(a);
		Iterator it = b.iterator();
		while(it.hasNext()){
			tmp.remove(it.next());
		}
		return tmp;
	}
	static TreeSet<Integer> ss(TreeSet<Integer> a, TreeSet<Integer> b){
		TreeSet<Integer> tmp = us(a,b);
		TreeSet<Integer> tmp1 = is(a,b);
		Iterator it = tmp1.iterator();
		while(it.hasNext()){
			tmp.remove(it.next());
		}
		return tmp;
	}
}