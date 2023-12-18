
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		scan.close();
		int x[]= {a,b,c};
		int cnt[]= {0,0};
		for(int i=0;i<3;i++) {
			if(x[i]==5)cnt[0]+=1;
			if(x[i]==7)cnt[1]+=1;
		}

		if(cnt[0]==2 &&cnt[1]==1)System.out.println("YES");
		else System.out.println("NO");
	}
}