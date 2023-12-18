
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String line = br.readLine();
		Scanner scan = new Scanner(System.in);

	    int a = scan.nextInt();
	    int b = scan.nextInt();
	    int c = scan.nextInt();
	    int d = scan.nextInt();
	    
	    if(a+b>c+d)
	    System.out.println("Left");
	    if((a+b)==(c+d))
		    System.out.println("Balanced");
	    if(a+b<c+d)
		    System.out.println("Right");


	}
}
