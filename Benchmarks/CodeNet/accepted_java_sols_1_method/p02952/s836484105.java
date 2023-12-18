import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int n=stdIn.nextInt();
//		int b=stdIn.nextInt();
//		int c=stdIn.nextInt();
		//int valen[]=new int[n+1];
		int cnt=0;
		for(int i=1;i<=n;i++) {
			int valen=String.valueOf(i).length();
			if((valen%2)==1) {
				cnt++;
			}
		}
		System.out.println(cnt);

	}

}
