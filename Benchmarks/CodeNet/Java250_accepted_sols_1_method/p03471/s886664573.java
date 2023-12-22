import java.util.Scanner;

//  C - Otoshidama

public class Main {
  public static void main(String[] args ) throws Exception {
	  Scanner sc = new Scanner(System.in);
	  Integer N = Integer.parseInt(sc.next());
	  Integer Y = Integer.parseInt(sc.next());

	  for(int i = 0; i <= N; i++) {
		  for(int m =0; m <= N-i; m++) {
			  int n = N-i-m;
			  if(i*10000+m*5000+n*1000 == Y) {
				 System.out.println(i+" "+m+" "+n);
				 return;
			  }
		  }
	  }
	 System.out.println("-1 -1 -1");
//    Scanner sc = new Scanner(System.in);
//    int N = Integer.parseInt(sc.next());
//    int Y = Integer.parseInt(sc.next());
//    Integer man = 0;
//    Integer gosen = 0;
//    Integer sen = 0;
//
//    label: for(int i = 0; i <= N; i++) {
//    	if(i * 10000 == Y && i == N) {
//			man = i;
//			break label;
//    	}
//    	for(int m = 0; m <= (N-i); m++) {
//			if(i * 10000 + m * 5000 == Y && i + m == N) {
//				man = i;
//				gosen = m;
//				break label;
//			}
//
//			for(int n = 0; n <= (N-i-m); n++) {
//				if(i * 10000 + m * 5000 + n * 1000 == Y && i + m + n == N) {
//					man = i;
//					gosen = m;
//					sen = n;
//					break label;
//				}
//			}
//    	}
//    }
//    if(man == 0 && gosen == 0 && sen ==0) {
//    	System.out.println("-1 -1 -1");
//    } else {
////		System.out.println(man*10000+gosen*5000+sen*1000);
////		System.out.println(man+gosen+sen);
//		System.out.println(man.toString()+" "+gosen.toString()+" "+sen.toString());
//    }

  }
}