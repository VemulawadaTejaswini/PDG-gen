import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
public class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,Integer>hm = new HashMap<Integer,Integer>();
		ArrayList<Integer>al = new ArrayList<Integer>();
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		for(int i = 0; i < n ; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(hm.containsKey(a)) {
				hm.put(a,hm.get(a)+ b);
			}
			else {
			hm.put(a,b);
			al.add(a);
			}
		}
		Collections.sort(al);
		int num = 0;
		long sum = 0;
		
		for(int i = 0; i < al.size() ; i++) {
			int p = al.get(i);
			num += hm.get(p);
			if(num < m) {
				sum += (long)p * hm.get(p);
			}
			if(num >= m) {
				sum += (long)p * (m - num + hm.get(p));
				break;
			}
				
			}
		System.out.println(sum);
		}
	}