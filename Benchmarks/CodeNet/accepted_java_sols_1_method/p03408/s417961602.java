
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String s[]=new String[n];
		int sint[]=new int[n];
		for(int i=0;i<n;i++) {
			s[i]=sc.next();
			for(int j=0;j<i;j++) {
				if(s[i].equals(s[j])) {
					sint[i]++;
					sint[j]++;
				}
			}
		}
		int m=sc.nextInt();
		String t[]=new String[m];
		for(int i=0;i<m;i++) {
			t[i]=sc.next();
			for(int j=0;j<n;j++) {
				if(t[i].equals(s[j])) {
					sint[j]--;
				}
			}
		}

		int saidai=-1;

		for(int i=0;i<n;i++) {
			if(saidai<sint[i])
				saidai=sint[i];
		}
		if(saidai>=0)
			System.out.print(saidai+1);
		else
			System.out.print(0);

	}

}
