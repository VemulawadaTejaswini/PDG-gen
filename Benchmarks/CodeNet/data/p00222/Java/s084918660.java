import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	static ArrayList<Integer> list;
	static ArrayList<Integer> listA;
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		list = new ArrayList<Integer>();
		listA = new ArrayList<Integer>();
		makePrimeList();
		makePrimeListA();
		while(true) {
			int n = stdIn.nextInt();
			if(n == 0) {
				 break;
			}
			if(n < 13) {
				System.out.println(0);
				continue;
			}
			int fm = 0;
			boolean al = false;
			
			
			for(int i = 0; i < listA.size(); i++) {
				if(al && listA.get(i) > n) {
					break;
				}
				if(listA.get(i) <= n) {
					al = true;
					fm = listA.get(i);
				}
			}
			System.out.println(fm);
			
		}
	}
	
	public static void makePrimeList() {
		boolean[] isPrime = new boolean[10000001];
		for(int i = 2; i < isPrime.length; i++) {
			isPrime[i] = true;
		}
		
		for(int i = 2; i< isPrime.length; i++) {
			if(isPrime[i]) {
				for(int j = i + i; j < isPrime.length; j += i) {
					isPrime[j] = false;
				}
			}
		}
		
		for(int i = 0; i < isPrime.length; i++) {
			if(isPrime[i]) {
				list.add(i);
			}
		}
	}
	
	public static void makePrimeListA() {
		for(int i = 0; i < list.size()-3; i++) {
			int a = list.get(i);
			int b = list.get(i + 1);
			int c = list.get(i + 2);
			int d = list.get(i + 3);
			
			if(a + 2 == b && a + 6 == c && a + 8 == d) {
				listA.add(d);
			}
		}
	}
	

}