import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int[] A= new int[N];
	    int[] B= new int[N];

        for (int i=0; i<N; i++) {
        	A[i]=gi();
        	B[A[i]-1] = i;
        }

        for (int i=0; i<N;i++) {
        	if(i!=0) System.out.print(" ");
        	System.out.print(B[i]+1);
        }

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
}