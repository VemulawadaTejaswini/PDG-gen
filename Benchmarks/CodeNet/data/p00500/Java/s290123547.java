import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[][] point=new int[300][10];
		int[] score=new int[102];
		int n=sc.nextInt();
		int k=0;
		boolean check=false;
		for(int i=0;i<n;i++){
			for(int j=0;j<3;j++){
			    point[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<n;j++){
				check=false;
			    for( k=0;k<n;k++){
			    	if(point[k][i]==point[j][i] && j!=k) check=true;
			    }
			    if(check==false) score[j]=score[j]+point[j][i];
			}
		}
		for(int i=0;i<n;i++) System.out.println(score[i]);
	}
}