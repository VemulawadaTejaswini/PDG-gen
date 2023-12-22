import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N=cin.nextInt();
		int[][]a=new int[N][3];
		int[] score=new int[N];
		for(int i=0;i<N;i++){
			for(int j=0;j<3;j++){
				a[i][j]=cin.nextInt();
			}
		}
		for(int j=0;j<3;j++){
			for(int i=0;i<N;i++){
				boolean f=true;
				for(int k=0;k<N;k++){
					if(i==k)continue;
					if(a[i][j]==a[k][j])f=false;
				}
				if(f)score[i]+=a[i][j];
			}
		}
		for(int i=0;i<N;i++){
			System.out.println(score[i]);
		}
	}

}