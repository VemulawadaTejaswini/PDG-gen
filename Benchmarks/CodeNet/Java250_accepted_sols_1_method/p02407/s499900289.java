import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //yousoの中身に一つ目の入力を保存
		int[] a = new int[n];//arrayって名前の配列を作成。要素数はretu
		for(int i=0; i< n; i++)a[i] = sc.nextInt(); //ｎの数だけ繰り返す。aを生成
		for(int j=a.length-1 ; j>=0; j--) {
			if(j!=0) {
			System.out.print(a[j] + " ");
		}else {
			System.out.print(a[j]);
		}
		}
		System.out.println();

}
}
