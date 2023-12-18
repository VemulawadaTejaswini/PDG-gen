import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		char c = n.charAt(n.length()-1);
		if(c!='s'){n=n+"s";}
		else{n=n+"es";}
		System.out.println(n);
       	}
}