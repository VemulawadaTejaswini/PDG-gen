import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] d = new int[n];
		for(int i=0; i<n; i++){
			d[i] = sc.nextInt();
		}
		Arrays.sort(d);

		if(n%2 != 0){
			System.out.println(0);
		}else{
			if(d[(n/2)-1]==d[n/2]){
				System.out.println(0);
			}else{
				System.out.println(d[n/2]-d[(n/2)-1]);
			}
		}

		sc.close();

	}

}
