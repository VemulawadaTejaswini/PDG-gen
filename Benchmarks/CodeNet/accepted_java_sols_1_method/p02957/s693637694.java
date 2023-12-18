import java.util.*;
public class Main {
static long A= 0;
static long B =0;
static long C=0;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B=  sc.nextInt();
		C=0;
		
		for(int i=1;i<Math.max(A,B);i++) {
			if(Math.abs(i-A)==Math.abs(i-B)) {
				C=i;
				break;
			}
		}
		if(C==0) {
			System.out.println("IMPOSSIBLE");
		}else {
			System.out.println(C);
		}
		

	}
}
