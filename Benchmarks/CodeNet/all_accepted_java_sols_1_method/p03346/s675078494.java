import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int mirs=0;
		int[] irs=new int[200001];
		for(int i=0; i<n; i++){
			int p=sc.nextInt();
			irs[p]=irs[p-1]+1;
			mirs=Math.max(mirs,irs[p]);
		}
		System.out.println(n-mirs);
	}
}
