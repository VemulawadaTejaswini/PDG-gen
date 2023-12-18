import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
        
		int[] a=new int[5];
		int ans=0;
		
		for(int i=0;i<5;i++) {
			a[i] = sc.nextInt();
			if (a[i]== 0) {
				ans =i;
			}
		}
		System.out.println(ans+1);
	}
}