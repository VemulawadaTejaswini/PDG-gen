
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
	Scanner sc	= new Scanner(System.in);
	
	String[] x = sc.next().split("");
	if(x[0].equals("9")){
		System.out.println("Yes");
	}else if(x[1].equals("9")){
		System.out.println("Yes");
	}else {
		System.out.println("No");
	}
	}
}