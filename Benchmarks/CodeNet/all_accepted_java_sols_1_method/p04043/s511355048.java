import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int A=in.nextInt();
		int B=in.nextInt();
		int C=in.nextInt();
		if((A==5 && B==5 && C==7) || (A==5 && B==7 && C==5) | (A==7 && B==5 && C==5))
			System.out.println("YES");
		else
			System.out.println("NO");
	}	
}