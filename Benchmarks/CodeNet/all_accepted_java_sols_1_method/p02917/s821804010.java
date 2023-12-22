import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  //配列aの長さ
		int arrayB [] = new int[n-1];  //配列Bの宣言

		//配列Bの入力
		for(int i=0 ; i<n-1 ; i++) {
			arrayB[i] = sc.nextInt();
		}

		int total = 0;  //配列Aの要素の総和

		for(int i=0 ; i<n ; i++) { //配列Aの要素数分回す
			if(i==0) {  //0番目と最後はそれぞれ配列Bの数字をそのまま足す
				total += arrayB[i];
			}
			else if(i==n-1) {
				total += arrayB[n-2];
			}
			else {  //途中の要素は1つ前の要素と比べて小さい方を足す
				total += Math.min(arrayB[i-1], arrayB[i]);
			}
		}
		System.out.print(total);
		sc.close();
	}
}