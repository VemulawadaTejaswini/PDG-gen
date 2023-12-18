import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int i=0;
		while(true){
			int a = cin.nextInt();
			if(a == 0) break;
			i++;
			System.out.println("Case "+i+": "+a);
		}
	}
}