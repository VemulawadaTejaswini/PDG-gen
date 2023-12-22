import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		String[] a = sc.next().split("");
		String[] b = sc.next().split("");
		String[] c = sc.next().split("");
		sc.close();
		int cnt = 0;
		for(int i=0;i<n;i++) {
			if(a[i].equals(b[i])&&b[i].equals(c[i])&&a[i].equals(c[i])) {

			}else if(a[i].equals(b[i])||b[i].equals(c[i])||a[i].equals(c[i])) {
				cnt++;
			}else {
				cnt+=2;
			}

		}
		System.out.println(cnt);
	}

}
