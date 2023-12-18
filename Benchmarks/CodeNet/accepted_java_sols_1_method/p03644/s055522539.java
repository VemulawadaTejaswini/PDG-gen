import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[]d = new int[6];
		d[0]=2;
		for(int i=1;i<6;i++) {
			d[i]=d[i-1]*2;
		}
		if(N==1)System.out.print(1);
		else if(d[5]<=N)System.out.print(d[5]);
		else {
			for(int i=0;i<6;i++) {
				if(N<d[i]) {
					System.out.print(d[i-1]);
					break;
				}
			}
		}
		sc.close();
	}
}