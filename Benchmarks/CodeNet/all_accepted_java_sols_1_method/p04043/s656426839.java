import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args){
 
		Scanner scan = new Scanner(System.in);
		int first	= scan.nextInt();
		int second	= scan.nextInt();
		int third	= scan.nextInt();
		
		if ((first == 5 || first == 7) & (second == 5 || second == 7) &(third == 5 || third == 7) &(first + second + third == 17)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}