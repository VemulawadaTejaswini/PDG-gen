import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[][] point=new int[200][10];
		int[] point2=new int[102];
		int n=sc.nextInt();
		int s=0;
		for(int i=1;i<=101;i++) point2[i]=0;
		for(int i=1;i<=3;i++){
			for(int j=1;j<=n;j++){
			    point[j][i]=sc.nextInt();
			}
		}
		for(int i=1;i<=3;i++){
			for(int j=1;j<=n;j++){
			    for(int k=1;k<=n;k++){
			    	if(point[j][i]!=point[k][i]) s+=1;
			    }
			    if(s>n-2) point2[j]=point2[j]+point[j][i];
			    s=0;
			}
		}
		for(int j=1;j<=n;j++){
			System.out.println(point2[j]);
		}
	}
}