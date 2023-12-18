import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int A=sc.nextInt();
		int B=sc.nextInt();
		int ans=(x-A)%B;

		System.out.println(ans);


	}
}