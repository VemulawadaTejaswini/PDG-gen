
import java.util.*;

class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong() -1;
		List<Integer> list = new ArrayList<>();
		
		while(N > 25) {
			list.add((int)(N % 26));
			 N = N / 26 - 1;
		}
		list.add((int)N);
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray(); 
		String ans = "";
		
		//System.out.println(list.size());
		//System.out.println(list.get(list.size()-1));
		
		for(int i = 0; i < list.size(); i++) {
			int index = list.get(list.size()-i-1);
			ans += alphabet[index];
		}
		
		System.out.println(ans);		
	}
}


