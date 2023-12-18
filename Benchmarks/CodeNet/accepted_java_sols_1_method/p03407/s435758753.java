import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		String ans;

		if(A+B>=C) ans="Yes";
		else ans="No";

		System.out.println(ans);

	}
}