import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		long[] q = new long[a];
		long[] p = new long[a];
		long count = 0;
		long sum = 0;
		long h = 0;
		ArrayList<Long> list=new ArrayList<Long>();
		long o = 0;
		long s = 0;
		for(int i = 0; i < a ; i++){
			long c = sc.nextLong();
			q[i]=c;
			o+=c;
		}
		for(int i = 0;i < a ; i++){
			long b = sc.nextLong();
			p[i]=b;
			s+=b;
		}
		if(o>=s){
			for(int i = 0; i<a; i++){
				if(q[i]>=p[i]){
					if(q[i]-p[i]<=o-s){
						list.add(q[i]-p[i]);
					}
					h++;
				}
			}
			if(h==a){
				System.out.println(0);
				return;
			}
		}else{
			System.out.println(-1);
			return;
		}
		Collections.sort(list);
		for(long k: list){
			if(k+sum<=o-s){
				sum+=k;
				count++;
			}
		}
		System.out.println(a-count);
	}
}