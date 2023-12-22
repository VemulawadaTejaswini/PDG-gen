import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int[] array = new int[N];
		int[] buff = new int[N];
		for(int i=0;i<N;i++) {
			array[i] = sc.nextInt();
		}
		buff = array.clone();
		Arrays.sort(buff);
		int flg=0;
		for(int i=0;i<N;i++) {
			if(array[i]!=buff[i]) {
				flg++;
			}
		}
		if(flg<=2) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
