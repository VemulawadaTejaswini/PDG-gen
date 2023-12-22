import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int juice[] =new int[a];
		int ans =0;
		
		for(int i =0;i<a;i++) {
			juice[i] = sc.nextInt();
		}
		
		Arrays.sort(juice);
		
		
		for(int i =0;i<b;i++) {
			ans =ans+juice[i];
		}
		System.out.println(ans);
	}

}
