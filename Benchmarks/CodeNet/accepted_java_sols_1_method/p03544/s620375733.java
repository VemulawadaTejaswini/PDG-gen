
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		long[] l=new long[87];

		for(int i=0;i<=n;i++){
			if(i==0){
				l[0]=2;
				continue;
			}
			if(i==1){
				l[1]=1;
				continue;
			}
			l[i]=l[i-1]+l[i-2];
		}

		System.out.println(l[n]);

	}

}
