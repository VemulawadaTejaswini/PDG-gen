import java.util.*;

public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n=Integer.parseInt(scan.next());
		int[] ans =new int [n];
		Arrays.fill(ans, 0);
		int a;
		for (int i=0;i<n-1;++i){
			a=Integer.parseInt(scan.next());
			ans[a-1]+=1;
		}

		for(int i=0;i<n;++i){
			System.out.println(ans[i]);
		}




	}
}
//end