import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int data=0;data<N;data++) {
			boolean ans = false;
			int[] a = new int[10];
			for(int i=0;i<10;i++) {
				a[i] = sc.nextInt();
			}
			for(int i=0;i<1024;i++) {
				int b = 0;
				int c = 0;
				boolean f = true;
				for(int j=0;j<10;j++) {
					if((i&(1<<j))==0) {
						if(a[j]>b) {
							b = a[j];
						}else{
							f = false;
							break;
						}
					}else{
						if(a[j]>c) {
							c = a[j];
						}else{
							f = false;
							break;
						}
					}
				}
				if (f) {
					ans = true;
					break;
				}
			}
			System.out.println(ans ? "YES" : "NO");
		}
	}
}