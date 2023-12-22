import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc=new Scanner(System.in);


		//参加者
		int N=sc.nextInt();
		//所持ポイント数
		int K=sc.nextInt();
		//正解の回数
		int Q=sc.nextInt();
		int[] arrayAnsCount=new int[Q];
		int[] arrayPoint=new int[N];


		//各回答者と持ちポイント数
		int intervalValue=K-Q;
		Arrays.fill(arrayPoint, intervalValue);

		//Qは問題数
		for(int i=0;i<arrayAnsCount.length;i++) {
			//正解者
			arrayAnsCount[i]=sc.nextInt();
			arrayPoint[arrayAnsCount[i]-1]=arrayPoint[arrayAnsCount[i]-1]+1;	
		}


		for(int i=0;i<N;i++) {
			if(arrayPoint[i]>0) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}

	}

}