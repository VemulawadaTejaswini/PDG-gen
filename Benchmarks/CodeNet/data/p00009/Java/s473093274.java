import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		boolean[] isntPrime = new boolean[100001];
		list.add(2);
		for(int i = 3; i < 100001; i += 2) {
			if(!isntPrime[i]) {
				list.add(i);
				for(int j = i + i; j < 100001; j += i) {
					isntPrime[j] = true;
				}
			}
		}
		while(scan.hasNext()){
			long n = scan.nextLong();
			int i = 0;
			for(i = 0; i < list.size(); i++) {
				if(list.get(i) > n) break;
			}
			System.out.println(i);
		}
	}
}