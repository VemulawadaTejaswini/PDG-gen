import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int T = scan.nextInt();
		int[] t = new int[N];

		for(int i=0;i<N;i++){
			t[i]=scan.nextInt();
		}

		long sumT = 0;

		for(int i=0;i<N;i++){
			if(i==N-1){
				sumT+=T;
			}else{

				if(t[i+1]-t[i]>=T){
					sumT+=T;
				}else{
					sumT+=t[i+1]-t[i];
				}


			}
		}

		System.out.println(sumT);

	}

}
