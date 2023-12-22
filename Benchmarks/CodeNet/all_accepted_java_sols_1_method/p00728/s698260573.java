import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc =new Scanner(System.in);
		ArrayList<Integer> hoge = new ArrayList<>();
		int i;
		int n;
		int []a;
		int sum;

		while(true) {
			sum=0;
			n=sc.nextInt();
			if(n==0)
				break;
			a=new int[n];
			for(i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			Arrays.sort(a);
			for(i=1;i<n-1;i++)
				sum+=a[i];
			hoge.add(sum/(n-2));
		}
		for(i=0;i<hoge.size();i++) {
			System.out.println(hoge.get(i));
		}
	}
}
