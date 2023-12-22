import java.io.PrintWriter;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        if(1<=A&&A<=9&&1<=B&&B<=9){
          out.println(A*B);
        }
        else{
          out.println(-1);
        }
		
 
		out.flush();
	}
}