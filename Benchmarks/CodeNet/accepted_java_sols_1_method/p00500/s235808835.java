import java.util.Scanner;
public class Main{
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int ans[]=new int[n];
		int point[][] = new int[n][3];
		for(int i=0;i<n;i++){
			for(int j=0;j<3;j++){
				point[i][j] = sc.nextInt();
			}
		}
		
		
		int cnt=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<3;j++){
				for(int k=0;k<n;k++){
					//System.out.println(point[i][j]+" "+point[k][j]);
					if(point[i][j] == point[k][j])cnt++;
				}
				if(cnt==1)ans[i]+=point[i][j];
				cnt=0;
			}
			System.out.println(ans[i]);
		}
		
		
	}
}