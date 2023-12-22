import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int[] count = new int[N];
		for(int i=0;i<N;i++) {
			 a[i] = sc.nextInt();
		}
		for(int odd : a) {
		if(odd%2 == 1) {
			System.out.println("0");
			System.exit(0);
		}

		}
			for(int b = 0;b<N;b++) {
				for(int c =0;c<100000000;c++) {
					if(a[b]%2==1) {
						break;
					}
					a[b]=a[b]/2;
					count[b]++;
				}
			}
			int min =1000000000;
		for(int d = 0;d<count.length;d++) {
			min = Math.min(min, count[d]);

		}
			System.out.println(min);
		}
}