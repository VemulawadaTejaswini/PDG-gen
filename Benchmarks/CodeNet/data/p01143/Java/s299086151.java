import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner as = new Scanner(System.in);
		int[] a = new int[3];
		while(true) {
			for(int i=0;i<3;i++) {
				a[i] = Integer.parseInt(as.next());
			}
			if(a[0] + a[1] + a[2] == 0) {
				break;
			}
			int sum = 0;
			int x = 0;
			for(int i=0;i<a[0];i++) {
				int c = Integer.parseInt(as.next());
				sum += c;
				if(i == a[1] - 1) {
					x = c;
				}
			}
			if(x == 0) {
				System.out.println(0);
			}else {
				System.out.println(sum * (100 - a[2]) / x);
			}
		}
	}
}
