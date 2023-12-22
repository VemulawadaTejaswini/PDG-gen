import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner a=new Scanner(System.in);
		int A=a.nextInt();
		int B=a.nextInt();
		int T=a.nextInt();
		int ans=T/A*B;
		System.out.println(ans);
	}
}