
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String line = br.readLine();
		Scanner scan = new Scanner(System.in);

	    String a = scan.next();
	    String[] b = a.split("");
	    int c =0;
	    
	    for(int i=0;i<3;i++){
	    if(b[i].equals("1"))
	    	c++;
	    }		
	    System.out.println(c);


	}
}
