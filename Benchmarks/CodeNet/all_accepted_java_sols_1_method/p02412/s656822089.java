import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int x = scan.nextInt();
		int count=0;
		 while(true) {
		     count = 0;
		for(int i=1;i<=n;i++) {
			for(int j=i+1;j<=n;j++) {
				for(int h=j+1;h<=n;h++) {
					if(x ==i+j+h )count ++;
					//System.out.println(i + " " + j + " " +h);
				}
			}
		}

		System.out.println(count);
		n = scan.nextInt();
		x = scan.nextInt();
		if(n == 0 && x == 0) break;
		}
		scan.close();
	}

}

