import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		int[] left=new int[n];
		int[] right=new int[n];
		for(int i=0; i<n-1; i++){
			if(s.charAt(i)=='W'){
				left[i+1]=1;
			}
			left[i+1]+=left[i];
		}
		for(int i=n-1; i>0; i--){
			if(s.charAt(i)=='E'){
				right[i-1]=1;
			}
			right[i-1]+=right[i];
		}
		int ans=n;
		for(int i=0; i<n; i++){
			ans=Math.min(ans,left[i]+right[i]);
		}
		System.out.println(ans);
	}
}

