import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int V = sc.nextInt();
		int B = sc.nextInt();
		int W = sc.nextInt();
		int T = sc.nextInt();

		if(V<=W) {
			System.out.println("NO");
		} else {
			int d = Math.abs(A-B);
				int t =d/(V-W);
				if(t>T) {
					System.out.println("NO");
				} else {
					System.out.println("YES");
				}


//			int d = Math.abs(A-B);
//			if(d%(V-W)!=0) {
//				System.out.println("NO");
//			} else {
//				int t =d/(V-W);
//				if(t>T) {
//					System.out.println("NO");
//				} else {
//					System.out.println("YES");
//				}
//			}
		}

	}
}