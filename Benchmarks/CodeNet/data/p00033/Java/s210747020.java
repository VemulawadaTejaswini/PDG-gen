import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] t=new int[10];
		int B=0;
		int C=0;

		for(int i=1; i<=n; i++){
			for(int j=0;j<10; j++){
				t[j]=sc.nextInt();

			}

			System.out.println(solve(t));
		}
	}
	public static String solve(int[] t															){
		int B=0;
		int C=0;
		for(int i=0; i<10; i++){
			if(t[i]>B){
				B=t[i];
			}else if(t[i]>C){
				C=t[i];
			}else{

				return "NO";


			}
		}
		return "YES";
	}


}

