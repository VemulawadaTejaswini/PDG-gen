import java.io.IOException;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long count=0;
		for(int i=1;i<n+1;i++) {
			for(int a=1;a<i/5;a++) {
				for(int b=1;b<i/5;b++) {
					for(int c=1;c<i/5;c++) {
						if(a*a+b*b+c*c+a*b+b*c+a*c==i&&(a==1||b==1||c==1)) {
							count++;
						}
					}
				}
			}
			System.out.println(count);
			count=0;
		}
	}
}