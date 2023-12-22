import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] =new int[n];
		int sa = 0;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);

		for(int i=0;i<n;i++){
			if(i%2==1)
				sa+=a[i];
			else
				sa-=a[i];

		}
		if(sa<0)
			sa=-sa;
		System.out.print(sa);
	}

}
