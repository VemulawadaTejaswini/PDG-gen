import java.util.*;

public class Main{
	static HashMap<String,ArrayList<String>> map;
	static ArrayList<ArrayList<String>> ans;

	static void solve(int rem,String s,ArrayList<String> al){
		if(rem == 0){
			ans.add(al);
			return;
		}

		for(String key : map.keySet()){
			if(s.startsWith(key)){
				String ns = s.substring(key.length());

				for(String val : map.get(key)){
					ArrayList<String> nal = new ArrayList<String>(al);
					nal.add(val);
					solve(rem-key.length(),ns,nal);
				}
			}
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] b = new int[128];
		b['a'] = b['b'] = b['c'] = 2;
		b['d'] = b['e'] = b['f'] = 3;
		b['g'] = b['h'] = b['i'] = 4;
		b['j'] = b['k'] = b['l'] = 5;
		b['m'] = b['n'] = b['o'] = 6;
		b['p'] = b['q'] = b['r'] = b['s'] = 7;
		b['t'] = b['u'] = b['v'] = 8;
		b['w'] = b['x'] = b['y'] = b['z'] = 9;

		while(true){
			int n = sc.nextInt();
			if(n == 0) break;

			map = new HashMap<String,ArrayList<String>>();

			for(int i=0;i<n;i++){
				String s = sc.next();
				String digit = "";
				for(char ch : s.toCharArray()){
					digit += b[ch];
				}
				if(!map.containsKey(digit)) map.put(digit,new ArrayList<String>());
				map.get(digit).add(s);
			}

			String s = sc.next();

			ans = new ArrayList<ArrayList<String>>();
			solve(s.length(),s,new ArrayList<String>());

			for(ArrayList<String> al : ans){
				System.out.println(al.toString().replaceAll("\\[|\\]|,","") + ".");
			}
			System.out.println("--");
		}
	}
}