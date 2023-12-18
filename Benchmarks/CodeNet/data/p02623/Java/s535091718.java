import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int m = in.nextInt();
		int k = in.nextInt();

		int[] a = new int[n];
		int[] b = new int[m];

		for(int i=0;i<n;i++) {
			a[i] = in.nextInt();
		}

		for(int i=0;i<m;i++) {
			b[i] = in.nextInt();
		}

		int value = 0;
		int count = 0;

		int i = 0;
		int j = 0;

		outside: while(true) {
			if(count==n+m) {
				break;
			}
			if(i>a.length-1) {
				value += b[j];
				if(value>k) {
					break;
				}
				count++;
				j++;
				continue outside;
			}else if(j>b.length-1) {
				value += a[i];
				if(value>k) {
					break;
				}
				count++;
				i++;
				continue outside;
			}

			if(a[i]<=b[j]) {
				value += a[i];
				if(value>k) {
					break;
				}
				count++;
				i++;
			}else {
				value += b[j];
				if(value>k) {
					break;
				}
				count++;
				j++;
			}
		}

		System.out.println(count);


	}

}
