import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext()){
			String s = stdIn.nextLine();
			s = s.toUpperCase();
			System.out.println(s);
		}
	}
}