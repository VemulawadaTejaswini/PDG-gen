import java.util.Arrays;
import java.util.Scanner;

class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[]=new int[m];
		int yen=0;
		int check=0;
		for(int i=0;i<m;i++) {
			a[i]=sc.nextInt();
			int useless=sc.nextInt();
		}
		Arrays.sort(a);
		for(int i=m-1;i>=0;i--) {
			if(check>=m-1) break;
			if(a[i]>=n) {
				check++;
			}else {
			yen+=n-a[i];
			check++;
			}
		}
		System.out.println(yen);
		}
	}
