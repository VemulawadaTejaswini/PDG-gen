import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String x = scan.next();
		String sx[] = x.split("");
		String[] a;
		a = new String[10000];
		int m = scan.nextInt();
		int i,t,c;
		for(i = 0; i < m; i++){
			c = 0;
			int h = scan.nextInt();
			for(t = h; t < x.length(); t++){
				a[c++] = sx[t];
			}
			for(t = 0; t < h; t++){
				a[c++] = sx[t];
			}
			for(t = 0; t < x.length(); t++){
				sx[t] = a[t];
			}
		}
		for(t = 0; t < x.length(); t++){
			System.out.print(sx[t]);
		}
		System.out.println();
		}
	}

		

	