import java.util.Scanner;

public class Main {
	public static void main (String[] args){
		int i=1;
		int a=1;
		while(a != 0){
			Scanner in = new Scanner(System.in);
			a = in.nextInt();
			if(a != 0){
				System.out.println("Case "+i+": "+a);
				i++;
			}
		}
	}
}