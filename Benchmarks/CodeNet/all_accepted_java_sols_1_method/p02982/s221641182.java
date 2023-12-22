import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int d = sc.nextInt();
		int ans=0;
		int[][] dd=new int[n][d];
		for(int i=0; i<n; i++){
			for(int j=0; j<d; j++){
				dd[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				int sum=0;
				for(int k=0; k<d; k++){
					sum+=(dd[i][k]-dd[j][k])*(dd[i][k]-dd[j][k]);
				}
				if(Math.sqrt(sum)==(int)Math.sqrt(sum)){
				
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}


