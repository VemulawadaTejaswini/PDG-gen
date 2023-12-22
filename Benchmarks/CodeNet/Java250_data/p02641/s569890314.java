import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner in = new Scanner(System.in);

		int x = in.nextInt();
		int n = in.nextInt();
		Integer a[] = new Integer[n];

		for(int i=0;i<n;i++) {
			a[i] = in.nextInt();
		}

		int c = 0;


		while(true) {
			if(Arrays.asList(a).contains(x-c)&&Arrays.asList(a).contains(x+c)) {
				c++;
				continue;
			}else {
				break;
			}
		}

		if(Arrays.asList(a).contains(x-c)) {
			System.out.println(x+c);
		}else {
			System.out.println(x-c);
		}


	}

}
