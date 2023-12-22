import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		// 3つの箱に１～Nどれか入る
		System.out.println(N*N*N);
	}
}