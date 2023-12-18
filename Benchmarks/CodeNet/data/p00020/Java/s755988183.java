import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner stdIn = new Scanner(System.in).useDelimiter("\\r\\n");
		while(stdIn.hasNext()){
			String s = stdIn.next();
			s = s.toUpperCase();
			System.out.println(s);
		}
	}
}