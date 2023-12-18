import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc =new Scanner(System.in);
		int a[] =new int[5];
		int b[] =new int[5];
		int sum=0;
		int min=0;
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
			b[i]=a[i]+9;
			b[i]=b[i]-b[i]%10;
			sum+=b[i];
			min = Math.max(min, b[i]-a[i]);

		}
		
		System.out.println(sum-min);

}
}



