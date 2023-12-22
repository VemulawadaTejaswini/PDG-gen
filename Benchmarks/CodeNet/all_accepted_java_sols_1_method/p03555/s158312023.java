import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		//int N = in.nextInt();
		//int K = in.nextInt();
		String c = in.nextLine();
		String d = in.nextLine();
		d = new StringBuilder(d).reverse().toString();
		/*for(int i=0; i<N; i++) {
			int x = in.nextInt();
			int d = Math.abs(x-K);
			if(Math.abs(x) < d) {
				sum += 2*x;
			}else {
				sum += 2*d;
			}
		}*/
		if(c.equals(d)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
		in.close();
	}
}