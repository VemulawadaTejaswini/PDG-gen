import java.util.*;


public class Main {

	
	// test #1
//	public static void main(String args[]) {
//		System.out.println("staring #1");
//		Scanner sc = new Scanner(System.in);
//		
//		int a = sc.nextInt();
//		
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		String s = sc.next();
//		
//		System.out.println(a+b+c+" "+s);
//		sc.close();
//	}

	// test #1  0322
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int cntN = sc.nextInt();		// 偶数
		int cntM = sc.nextInt();		// 奇数
		
		int pat1=1;
		int pat2=1;
		
		int ctr=0;
		
		// pattern 1 ( N+N )
		for (int i=cntN; i>0 && ctr<2;i--) {
			pat1=pat1*i;
			ctr++;
		}
		pat1 = pat1/2;

		
		ctr=0;
		// pattern 2 ( M+M )
		for (int i=cntM; i>0 && ctr<2; i--) {
			pat2=pat2*i;
			ctr++;
		}
		pat2 = pat2/2;
		
		log( pat1+pat2);
		sc.close();
	}

	static void log(String s) {
		System.out.println(s);
	}

	static void log(int i) {
		System.out.println(i);
	}
	
}
