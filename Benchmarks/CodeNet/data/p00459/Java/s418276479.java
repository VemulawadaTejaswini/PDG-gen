import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//Shuffle
public class Main{
	
	void run(){
		Scanner sc = new Scanner(System.in);
		long mask = (1L << 32)-1;
		Comparator<Long> C = new Comparator<Long>() {
			public int compare(Long o1, Long o2) {
				return (int) ((o1>>32)-(o2>>32));
			}
		};
		for(;;){
			int n = sc.nextInt();
			if(n==0)break;
			int m = sc.nextInt(), P = sc.nextInt(), Q = sc.nextInt(), R = sc.nextInt();
			List<Long> l = new LinkedList<Long>();
			l.add(((long)P<<32)|Q);
			int[] p = new int[m], q = new int[m];
			for(int i=0;i<m;i++){
				p[i] = sc.nextInt(); q[i] = sc.nextInt();
			}
			for(int i=m-1;i>=0;i--){
				long t1 = n-q[i], s2 = t1+1, t2 = n-p[i], s3 = n-p[i]+1, y = q[i];
//				System.out.println("s1:"+s1+" t1:"+t1+" s2:"+s2+" t2:"+t2+" s3:"+s3+" t3:"+t3);
//				long d = n-q[i]-p[i];
//				System.out.println("Ranges");
//				for(long x:l){
//					long s = x>>32, t = x&mask;
//					System.out.println(s+","+t);
//				}
//				System.out.println("end Ranges");
				List<Long> next = new LinkedList<Long>();
				for(int j=0;j<l.size();j++){
					long x = l.get(j);
					long s = x>>32, t = x&mask;
//					System.out.println(s+","+t);
					if(t<=t1){
//						System.out.println("T1");
//						System.out.println((s+y)+","+(t+y));
						next.add((s+y)<<32 | (t+y));
					}
					else if(t<=t2){
//						System.out.println("T2");
						if(s<=t1){
//							System.out.println((s+y)+","+(t1+y));
							next.add((s+y)<<32 | (t1+y));
							s = s2;
						}
//						System.out.println((s-s2+p[i]+1)+","+(t-s2+p[i]+1));
						next.add((s-s2+p[i]+1)<<32 | (t-s2+p[i]+1));
					}
					else{
//						System.out.println("T3");
						if(s<=t1){
//							System.out.println((s+y)+","+(t1+y));
							next.add((s+y)<<32 | (t1+y));
							s = s2;
						}
						if(s<=t2){
//							System.out.println((s-s2+p[i]+1)+","+(t2-s2+p[i]+1));
							next.add((s-s2+p[i]+1)<<32 | (t2-s2+p[i]+1));
							s = s3;
						}
//						System.out.println((s-s3+1)+","+(t-s3+1));
						next.add((s-s3+1)<<32 | (t-s3+1));
					}
				}
				l = next;
			}
			int res = 0;
			Collections.sort(l, C);
//			System.out.println(l.size()+" size");
			for(long x:l){
				long s = x>>32, t = x&mask;
//				System.out.println(s+","+t);
				if(R<s)break;
				if(R<t)t = R;
				res+=t-s+1;
			}
			System.out.println(res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}