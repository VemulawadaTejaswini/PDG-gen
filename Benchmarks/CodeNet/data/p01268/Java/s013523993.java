import java.util.*;
public class Main {
	public static ArrayList<Integer> list;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		list = new ArrayList<Integer>();
		makeList(1000000);
		while(true) {
			int n  = stdIn.nextInt();
			int p = stdIn.nextInt();
			
			if(n == -1 &&p == -1) break;
			int ans = solv(n,p);
			System.out.println(ans);
			
		}
	}
	
	public static void makeList(int a) {
		boolean[] isPrime = new boolean[a];
		int ispln = isPrime.length;
		for(int i = 2; i < ispln; i++) {
			isPrime[i] = true;
		}
		for(int i = 2; i < ispln; i++) {
			if(isPrime[i]) {
				list.add(i);
				for(int j = i + i; j < ispln; j += i) {
					isPrime[j] = false;
				}
			}
		}
	}
	
	public static int solv(int n, int p) {
		ArrayList<Integer> listTMP = new ArrayList<Integer>();
		int count = 0;
		int lsi = list.size();
		for(int i = 0; i < lsi && count <= p; i++) {
			int ts = list.get(i);
			if(ts > n) {
				listTMP.add(ts);
				count++;
			}
		}
		PriorityQueue<Integer> listAns = new PriorityQueue<Integer>();
		int ltsi = listTMP.size();
		for(int i = 0; i < ltsi; i++) {
			for(int j = i; j < ltsi; j++) {
				listAns.add(listTMP.get(i) + listTMP.get(j));
			}
		}
		for(int i = 0; i < p-1; i++) {
			
			int tmp = listAns.poll();
		}
		return listAns.poll();
		
	}
	
}