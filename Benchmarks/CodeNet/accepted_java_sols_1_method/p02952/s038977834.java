import java.util.Scanner;
public class Main {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();

	int a = String.valueOf(N).length();

	if(a==1) System.out.print(N);

	else if(a==2) System.out.print(9);

	else if(a==3) System.out.print(9+(N-99));

	else if(a==4) System.out.print(909);

	else if(a==5) System.out.print(909 + (N-9999));

	else if(a==6) System.out.print(90909);



}
}