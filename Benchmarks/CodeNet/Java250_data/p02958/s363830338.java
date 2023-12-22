import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int c=0;
		for(int i=0;i<n-1;i++) {
			int min=a[i];
			int mins=i;
			for(int j=i+1;j<n;j++) {
				if(min>a[j]) {
					min=a[j];
					mins=j;
				}
			}
			if(min!=a[i]) {
				c++;
				int h=a[i];
				a[i]=a[mins];
				a[mins]=h;
			}

		}
		if(c<2) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}

}