import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
	    Scanner sc = new Scanner(System.in);  //標準入力の宣言

		int N = sc.nextInt();        //標準入力(入力人数)をNに代入

		int[] intArray;          //int型の1次元配列intArrayを宣言
		intArray = new int[N];   //N個1次元配列intArrayを宣言

		for(int i = 0; i<N; i++) {
			intArray[i] = sc.nextInt();
		}

	//配列を順番に読む
	int sum;          //一時計算用変数を宣言
	int kotae = 0;    //答えの変数を宣言
	for(int i=0; i<N; i++) {
		sum = 0;
		for(int j=i+1; j<N; j++) {
			sum = sum + intArray[j];
		}
		kotae = kotae + intArray[i] * sum;
	}
			
		System.out.println(kotae);

  }
}
