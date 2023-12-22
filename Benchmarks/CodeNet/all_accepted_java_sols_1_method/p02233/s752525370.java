import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int DP[]=new int[45];
		DP[0]=1; DP[1]=1;
		
		for(int i=2;i<=44;i++)DP[i]=DP[i-1]+DP[i-2];
		
		System.out.println(DP[in.nextInt()]);
		in.close();
	}

}
