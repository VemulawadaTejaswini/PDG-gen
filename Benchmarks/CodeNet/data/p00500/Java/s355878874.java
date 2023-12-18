import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] pl=new int[n][3];
		for(int i=0;i<n;i++){
			for(int j=0;j<3;j++){
				pl[i][j]=sc.nextInt();
			}
		}
		for(int h=0;h<3;h++){
			for(int i=0;i<n-1;i++){
				for(int j=i+1;j<n;j++){
					if(Math.abs(pl[i][h])==Math.abs(pl[j][h])){
						if(pl[j][h]<0){
							break;
						}
						pl[i][h]=-1*Math.abs(pl[i][h]);
						pl[j][h]=-1*Math.abs(pl[j][h]);
					}
				}
			}
		}
		for(int i=0;i<n;i++){
			int tmp=0;
			for(int j=0;j<3;j++){
				if(pl[i][j]>0){
					tmp+=pl[i][j];
				}
			}
			System.out.println(tmp);
		}
	}
}