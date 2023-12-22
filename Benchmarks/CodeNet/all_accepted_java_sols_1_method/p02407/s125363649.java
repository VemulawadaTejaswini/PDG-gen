import java.util.Scanner;

public class Main{

	static Scanner scan = new Scanner(System.in);
	
	/**
	 * 入力した数字を反対側から出力するプログラム
	 * @param args
	 */
	public static void main(String[] args){
		int n = scan.nextInt();
	//	int n = Integer.parseInt(args[0]);
		int[] a= new int[100];
		for(int i= 1 ; i<n+1;i++){
			a[i-1] = scan.nextInt();
//			a[i-1] = Integer.parseInt(args[i]);
		}

		for(int i = 0;i <n;i++){
			System.out.print(a[n-i-1]);
			if(i != n-1)
				System.out.print(" ");
		}
		System.out.println("");//おまじない
	}
}

