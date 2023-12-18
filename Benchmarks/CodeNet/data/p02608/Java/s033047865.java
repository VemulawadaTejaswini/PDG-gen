import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		int[] array = new int[n+1];
		int ans = 0;

		for(int x=1;x<100;x++) {
			for(int y=1;y<100;y++) {
				for(int z=1;z<100;z++) {
					ans = (x*x)+(y*y)+(z*z)+(x*y)+(y*z)+(z*x);
					if(ans <= n) {
						array[ans]++;
					}
				}
			}
		}
		for(int i=1;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}

}