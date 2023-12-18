import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n == 0 )break;
			else calc(n);
			
		}
	}
	public void calc(int n){
		String[] as = new String[n];
		String[] bs = new String[n];
		for(int i = 0; i < n; i++){
			as[i] = sc.next();
			bs[i] = sc.next();
		}
		String y = sc.next();
		String f = sc.next();
		
		
		HashMap<String, Integer> hash = new HashMap<String, Integer>();
		ArrayList<String> list = new ArrayList<String>();
		
		hash.put(y, 0);
		list.add(y);
		
		while(list.size() != 0){
			String now = list.get(0);
			list.remove(0);
			
			for(int i = 0; i < n; i++){
				String after = substitute(now, as[i], bs[i]);
				if(after.equals(f)){
					hash.put(after, hash.get(now) + 1);
					list = new ArrayList<String>();
					break;
				}
				else if(after.length() < f.length() && !hash.containsKey(after)){
					hash.put(after, hash.get(now) + 1);
					list.add(after);
				}
			}
		}
		
		if(hash.containsKey(f)) System.out.println(hash.get(f));
		else System.out.println(-1);
	}

	public String substitute(String input, String a, String b){
		input = input + "!";
		String[] list = input.split(a);
		String ans = list[0];
		for(int i = 1; i < list.length; i++){
			ans += b;
			ans += list[i];
		}
		return ans.substring(0, ans.length()-1);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}