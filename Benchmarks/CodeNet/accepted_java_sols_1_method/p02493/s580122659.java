import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] data = new int[100];
		int n,i;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(i=0; i<n; i++){
			data[i] = sc.nextInt();
		}
		for(i=n-1; i>=0; i--){
			if(i<n-1){
				System.out.print(" ");
			}
			System.out.print(data[i]);
		}
		System.out.println("");

	}

}