import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i = 1;
		
		int n;
		do {
			n = sc.nextInt();
			if (n == 0){
				break;
			} else {
				System.out.println("Case " + i + ": " + n);
				i++;
			}
		} while(!(n == 0));
	}
}