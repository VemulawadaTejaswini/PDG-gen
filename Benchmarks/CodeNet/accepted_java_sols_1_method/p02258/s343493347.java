import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] R=new int[n];
		for(int i=0;i<n;i++){
			R[i]=sc.nextInt();
		}
		int maxv=R[1]-R[0];
		int minv=R[0];
		for(int j=1;j<n;j++){
			maxv=Math.max(maxv,R[j]-minv);
			minv=Math.min(minv,R[j]);
		}
		System.out.println(maxv);
	}
}
