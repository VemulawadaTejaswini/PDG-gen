import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		while(sc.hasNext()){
			int n=sc.nextInt();
			int  num[][]=new int[n][3];
			for(int i=0; i<n; i++){
				for(int j=0; j<3; j++){
					num[i][j]=sc.nextInt();
				}
			}
			int score[]=new int[n];
			for(int i=0;i<n;i++){
				score[i]=0;
			}
			for(int j=0; j<3; j++){
				for(int i=0; i<n; i++){
					for(int k=i+1; k<n; k++){
						if(num[i][j]==num[k][j]){
							num[i][j]=num[k][j]=0;
						}
					}
				}
			}
			for(int i=0;i<n;i++){
				for(int j=0;j<3;j++){
					score[i]+=num[i][j];
				}
			}
			for(int i=0;i<n;i++){
				System.out.println(score[i]);
			}
		}
	}

}