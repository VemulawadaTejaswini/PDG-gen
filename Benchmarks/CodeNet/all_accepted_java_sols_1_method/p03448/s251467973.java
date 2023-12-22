import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
int ans=0;
		for (int i1 = 0; i1 <= a; i1++) {
			for (int i2 = 0; i2 <= b; i2++) {
				for (int i3 = 0; i3 <= c; i3++) {

			if(500*i1+100*i2+50*i3==x){
				ans++;
			}


				}
			}
		}
System.out.println(ans);
	}
}
