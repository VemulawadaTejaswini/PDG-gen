

import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

        int[] A=new int[5];
        for (int i=0; i<5; i++) {
        	A[i]=gi();
        }
        
        int max=0;
        int t=0;
        for (int i=0; i<5; i++) {
        	int ta=A[i]%10==0 ? A[i]:A[i]+(10-(A[i]%10));
        	t+=ta;
        	if((A[i]%10 !=0) &&(10 - (A[i]%10) >max) ) {
        		max=10 - (A[i]%10);
        	}
        }
        


        System.out.print(t-max);

//        if (s>L[n-2]) {
//        	System.out.println("Yes");
//        }else {
//        	System.out.println("No");
//        }
	}

	// 文字列として入力を取得
	public static String gs() {
		return scanner.next();
	}

	// intとして入力を取得
	public static int gi() {
		return Integer.parseInt(scanner.next());
	}

	// longとして入力を取得
	public static long gl() {
		return Long.parseLong(scanner.next());
	}

	// doubleとして入力を取得
	public static double gd() {
		return Double.parseDouble(scanner.next());
	}
}