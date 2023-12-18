import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][][] pl=new int[n][3][2];
		for(int i=0;i<n;i++){
			for(int j=0;j<3;j++){
				pl[i][j][0]=sc.nextInt();
				pl[i][j][1]=0;
			}
		}
		for(int h=0;h<3;h++){
			for(int i=0;i<n-1;i++){
				for(int j=i+1;j<n;j++){
					if(pl[i][h][0]==pl[j][h][0]){
						if(pl[i][h][1]==-1&&pl[j][h][1]==-1){
							break;
						}
						pl[i][h][1]=-1;
						pl[j][h][1]=-1;
					}
				}
			}
		}
		for(int i=0;i<n;i++){
			int tmp=0;
			for(int j=0;j<3;j++){
				if(pl[i][j][1]!=-1){
					tmp+=pl[i][j][0];
				}
			}
			System.out.println(tmp);
		}
	}
}