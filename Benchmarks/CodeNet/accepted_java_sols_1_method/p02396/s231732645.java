import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();         
		int b = 1;         
		while (a != 0){System.out.println("Case "+b+": "+a);             
		b++;
		a = sc.nextInt(); 
		}
	}
}