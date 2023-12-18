import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				for (int j = n-1; j > i; j--) {
					if(a[j-1]<a[j]){
						int t=a[j];
						a[j]=a[j-1];
						a[j-1]=t;
					}
				}
			}
			int c=0;
			for (int i = 0; i < n; i++) {
				if(c>0){
					c-=a[i];
				}else{
					c+=a[i];
				}
			}
			System.out.println(c>0?c:-c);
		}
	}
}