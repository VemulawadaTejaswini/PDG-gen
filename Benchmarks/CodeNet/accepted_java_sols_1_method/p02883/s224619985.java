import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long n = sc.nextLong();
		long k = sc.nextLong();
		
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> x = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			a.add(sc.nextInt());
		}
		for(int i=0;i<n;i++) {
			x.add(sc.nextInt());
		}
		Collections.sort(a);
		Collections.sort(x);
		
		//String s = sc.next();

		//String[] ss = s.split("");

		//int[] a = new int[n];
		
		long upper  = (long)a.get(a.size()-1)*x.get(x.size()-1);
		long lower = -1;
		
		while(upper>lower+1) {
			long target = lower + (upper-lower)/2;
			long counter = 0;
			
			for(int i=0;i<n;i++) {
				long max = target/x.get((int) (n-1-i));
				if(a.get(i)>max) {
					counter += a.get(i)-max;
				}
			}
			if(counter>k) {
				lower = target;
			}else {
				upper = target;
			}
		}
		
		long ans = lower+1;
		
		System.out.println(ans);

		/*
		TreeMap<Integer,Integer> treeMap = new TreeMap<>();//sorted no duplication
		treeMap.put(b[n], n);
		*/

	}

}
/*
class City{
	int order;
	int prefecture;
	int year;
	int number;
	City(int order,int prefecture, int year){
		this.order = order;
		this.prefecture = prefecture;
		this.year = year;
	}
}
*/
