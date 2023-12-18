import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Danger:10000001700
//Danger:10000003104
//Danger:10000003860
//Danger:10000004400
//Danger:10000005444

//No Story
public class Main{
	
	long gcd(long a, long b){
		return b==0?a:gcd(b, a%b);
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
//		long T = System.currentTimeMillis();
		for(;;){
			long L = sc.nextLong();
			if(L==0)break;
			List<Long> l = new ArrayList<Long>();
//			Set<Long> set = new HashSet<Long>();
			for(long i=1;i*i<=L;i++)if(L%i==0){
				l.add(i);
				if(i!=L/i)l.add(L/i);
			}
//			for(long x:set)l.add(x);
			Collections.sort(l);
			int res = 0;
//			System.out.println("S:" + l.size());
			for(int i=0;i<l.size();i++)for(int j=i;j<l.size();j++)if(L==l.get(i)/gcd(l.get(i), l.get(j))*l.get(j))res++;
			System.out.println(res);
//			if(System.currentTimeMillis()-T > 50)System.out.println("Danger:"+L);
		}
//		System.out.println("Time: " + (System.currentTimeMillis()-T));
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}