import java.io.IOException;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long count=0;
		for(int i=1;i<n+1;i++) {
			for(int b=1;b<i;b++) {
				for(int c=1;c<i;c++) {
					if(1+b*b+c*c+b+b*c+c==i) {
						if(b!=1&&c!=1) {
							if(b!=c) {
								count=6;
							}else{
								count=3;
							}
						}else {
							if(b!=c) {
								count=3;
							}else {
								count=1;
							}
						}
					}
				}
			}
			System.out.println(count);
			count=0;
		}
	}
}