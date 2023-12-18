import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int count=0;
			int n=sc.nextInt();
			for(int a=0;a<=n;a++) {
				for(int b=0;b<=n;b++) {
					for(int c=0;c<=n;c++) {
						for(int d=0;d<=n;d++) {
							if(a+b+c+d==n) {
								count++;
							}
						}
					}
				}
			}
			System.out.printf("%d\n",count);
		}
	}
}

