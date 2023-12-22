import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A= sc.nextInt();
		int B= sc.nextInt();
		int C=A+B;
		int D=A-B;
		int E=A*B;
		int ans=0;
		ans=Math.max(E, (Math.max(C, D)));	
	System.out.println(ans);
	}
}