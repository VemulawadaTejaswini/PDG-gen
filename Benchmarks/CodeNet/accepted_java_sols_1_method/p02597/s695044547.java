import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();

		sc.close();
		String[] array = str.split("");

		String[] ok_Array = new String[n];
		Arrays.fill(ok_Array, "W");

		int tmp=0;
		for(int i=0;i<n;i++) {
			if(array[i].equals("R")) {
				tmp++;
			}
		}

		for(int i=0;i<tmp;i++) {
			ok_Array[i] = "R";
		}

		int ans = 0;
		for(int i=0;i<n;i++) {
			if(!array[i].equals(ok_Array[i])) {
				ans++;
			}
		}

		System.out.println(ans/2);



	}
}