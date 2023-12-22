import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
      
     Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] number = new int[N];

		int count = 0;

		//偶数判定（2で割り切れなくなるまで）
		for (int i = 0; i < N; i++) {
			number[i] = sc.nextInt();
			while (number[i] % 2 == 0) {
				number[i] /= 2;
				count++;
			}
		}
		System.out.println(count);
    }
}
