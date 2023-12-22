import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int X=scanner.nextInt();
		int Y=scanner.nextInt();
		int i = 0;
		while(true) {
			if(i > X){
				System.out.println("No");
				break;
				}
			if(Y == 4*i+2*(X-i)) {
				System.out.println("Yes");
				break;
			}
			i++;
		}
		scanner.close();
	}
}