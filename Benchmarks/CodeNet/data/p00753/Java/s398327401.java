import java.util.*;
public class Main {
	static ArrayList<Integer> list;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		list = new ArrayList<Integer>();
		makeList();
		while(true) {
			int n = stdIn.nextInt();
			if(n == 0) break;
			int counter = 0;
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i) > n && list.get(i) <= 2 * n) {
					counter++;
				}
			}
			System.out.println(counter);
		}
		
		
	}
	
	public static void makeList() {
		boolean[] isPrime = new boolean[123456*2+1];
		for(int i = 2; i < 123456*2+1; i++) {
			isPrime[i] = true;
		}
		for(int i = 2; i < 123456*2+1; i++) {
			if(isPrime[i] == true) {
				list.add(i);
				for(int j = i + i; j < 123456*2+1; j+=i) {
					isPrime[j] = false;
				}
			}
		}
		
	}
}