
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws Exception {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(System.in);
		int A[] = new int[Integer.parseInt(scanner.next())];
		//Scanner scanner = new Scanner(br.readLine());
		for(int i=0; i<A.length; i++) {
			A[i] = Integer.parseInt(scanner.next());
		}
		//scanner.close();
		int B[] = new int[Integer.parseInt(scanner.next())];
		//scanner = new Scanner(br.readLine());
		for(int i=0; i<B.length; i++) {
			B[i] = Integer.parseInt(scanner.next());
		}
		scanner.close();

		int ret = 0;
		for(int i=0; i<B.length; i++) {
			for(int j=0; j<A.length; j++) {
				if(B[i]==A[j]) {
					ret++;
					break;
				}
			}
		}
		System.out.println(ret);

	}

}

