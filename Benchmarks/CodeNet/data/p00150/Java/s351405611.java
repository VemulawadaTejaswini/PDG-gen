import java.util.*;
public class Main {
	static ArrayList<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		makePrimeList();
		while(true) {
			int a = sc.nextInt();
			if(a == 0) break;
			int ansa = 0;
			int ansb = 0;
			
			for(int i = 1; i < list.size(); i++) {
				if(list.get(i) <= a &&list.get(i) - list.get(i-1) == 2) {
					ansa = list.get(i-1);
					ansb = list.get(i);
				}
			}
			System.out.println(ansa + " " + ansb);
		}
		sc.close();
	}
	
	static void makePrimeList() {
		boolean[] isntPrime = new boolean[10000];
		int i = 2;
		for(; i*i < 10000; i++) {
			if(!isntPrime[i]) {
				list.add(i);
				for(int j = i + i; j < 10000; j += i) {
					isntPrime[j] = true;
				}
			}
		}
		for(; i < 10000; i++) {
			if(!isntPrime[i]) {
				list.add(i);
			}
		}
	}
}     