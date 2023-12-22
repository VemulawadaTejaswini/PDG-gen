import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=1,c=0;
		int N = sc.nextInt();
		int[] a = new int [N+1];
		a[0]=0;
		for(int i=1;i<=N;i++) {
			a[i]=sc.nextInt();
		}
		for(;;) {
			if(a[x]==2) {
				c++;
				break;
			}
			else if(N<c) {
				c=-1;
				break;
			}
			else {
				c++;
				x=a[x];
			}
		}
		System.out.print(c);
		sc.close();
	}
}