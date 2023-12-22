import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),cnt=0;
		int[][] a=new int[n][3];
		int[] ans=new int[n];
		for(int i=0;i<n;i++){
			for(int j=0;j<3;j++){
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<3;j++){
				for(int k=0;k<n;k++){
					if(a[i][j]==a[k][j])cnt++;	
				}
				if(cnt==1)ans[i]+=a[i][j];
				cnt=0;
			}
		}
		for(int i=0;i<n;i++){
			System.out.println(ans[i]);
		}
	}	
}