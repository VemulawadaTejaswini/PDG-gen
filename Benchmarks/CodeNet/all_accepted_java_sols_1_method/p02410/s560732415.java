import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int height=sc.nextInt();
		int wide=sc.nextInt();
		int[][] matrix=new int[height][wide];
		int[] vector=new int[wide];

		//入力
		for(int i=0;i<height;i++){
			for(int j=0;j<wide;j++){
				matrix[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<wide;i++){
			vector[i]=sc.nextInt();
		}

		//計算
		int[] ans_ary=new int[height];
		for(int i=0;i<height;i++){
			for(int j=0;j<wide;j++){
				ans_ary[i]+=matrix[i][j]*vector[j];
			}
		}

		//出力
		for(int i=0;i<height;i++){
			System.out.println(ans_ary[i]);
		}
	}

}

