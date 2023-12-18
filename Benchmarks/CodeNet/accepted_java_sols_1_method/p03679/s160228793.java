
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//	String line = br.readLine();

		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		int ba = b-a;
		
		
		if(ba<=0)
		System.out.println("delicious");
		else if(x>=ba)
			System.out.println("safe");
		else
			System.out.println("dangerous");
		
}
}