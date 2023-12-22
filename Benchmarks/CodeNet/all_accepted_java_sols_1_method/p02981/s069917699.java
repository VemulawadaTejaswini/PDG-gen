import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int ans=0;	
		int N=sc.nextInt();	
		int A=sc.nextInt();	
		int B=sc.nextInt();	
		ans=Math.min(B,N*A);
	System.out.println(ans);
	}
}