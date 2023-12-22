import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int H = sc.nextInt();
		Queue w = new PriorityQueue(Collections.reverseOrder());
	//	long maxthrow = 0;
		int maxatk = 0;
		int res = 0;
		for(int i = 0 ; i<N; i++){
			int atk = sc.nextInt();
			int thr = sc.nextInt();
			w.add(thr);
			maxatk = Math.max(maxatk, atk);
		//	maxthrow += thr;
		}
//		System.out.println(w);
		while(!w.isEmpty()){
			if(maxatk > (int)w.peek())break;
	//		System.out.println("TEST");
			H-=(int)w.poll();
			res++;
			if(H<=0)break;
		}
//		System.out.println(res);
		if(H>0){
		//	System.out.println("TEST");
			res+= Math.ceil(  ( (double)H/(double)maxatk ) );
		}
		
		System.out.println(res);
	}
}