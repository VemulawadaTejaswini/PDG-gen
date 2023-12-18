import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong();
		long K = sc.nextLong();
		//(N/K)回操作を行うことで整数がN%K(NをKで割った余り）となる
		//例：10と3の場合、10/3の3回操作を行うと整数は1となる
		long a = N%K;
		//余りaに対して-KをするとK-aと同じになる
		//（K-a)-Kの操作を行ってもaに戻るだけなので
		//よって答えがaかK-aの小さい方となる
		System.out.println(Math.min(a, K-a));
	}
}
