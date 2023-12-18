import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int array[] = new int[N];
		int count = 0;
		for(int i = 0; i < N; i++){
			array[i] = sc.nextInt();
		}

		for(int i = 0; i < N; i++){
			for(int j = N-1; j >=1; j--){
				if(array[j]< array[j-1]){
					int tmp = array[j];
					array[j] = array[j-1];
					array[j-1] = tmp;
					count++;
				}
			}
		}
		for(int i = 0; i < N; i++){
			if(i == N-1){
				System.out.println(array[i]);
			}else{
				System.out.print(array[i] + " ");
			}
		}
		System.out.println(count);
		sc.close();

	}
}

