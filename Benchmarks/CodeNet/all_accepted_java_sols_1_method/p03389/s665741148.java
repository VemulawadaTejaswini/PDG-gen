import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc =new Scanner(System.in);
		int a[]=new int[3];
			for(int i=0;i<3;i++) {
				a[i]=sc.nextInt();
			}
			Arrays.sort(a);
			int d[]=new int[2];
			for(int i=0;i<2;i++) {
				d[i]=a[2]-a[i];
			}
			int sumd=d[0]+d[1];
			if(sumd%2==0) {
				System.out.println(sumd/2);
				return;
			}
			else {
				System.out.println(sumd/2+2);
				return;
			}
	}

}
