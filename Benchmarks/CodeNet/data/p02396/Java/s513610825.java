import java.util.Scanner;

public class Main {
	public static void main (String[] args){
		int i=0, n=1;
		int a=1;
		int Case[];
		Case = new int[100];
		while(a != 0){
			Scanner in = new Scanner(System.in);
			a = in.nextInt();
			Case[i] = a;
			i++;
		}
		i=0;
		while(Case[i] != 0){
			System.out.println("Case "+n+": "+Case[i]);
			n++;
			i++;
		}
	}
}