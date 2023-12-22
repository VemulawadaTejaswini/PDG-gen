import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int a,b;
		
		a=A/C;
		b=B/D;
		if(A%C!=0) a++;		
		if(B%D!=0) b++;
		if(a>b) System.out.println(L-a);
		else System.out.println(L-b);
	}
}