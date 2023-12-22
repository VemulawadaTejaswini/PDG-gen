import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args)throws Exception {
		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt();
		int moch[] = new int[cnt];
		int num = 0;
		for(int i = 0;i < cnt;i++) {
			moch[i] = scan.nextInt();
		}
		Arrays.sort(moch);
		for(int i = 0;i < cnt-1;i++) {
			if(moch[i] != moch[i+1]) {
				num++;
			}
		}
		System.out.println(num+1);

		scan.close();
	}
}