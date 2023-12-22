import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),k=sc.nextInt();
		for(int i=a ; i<=b; i++) {
			if(i < a+k || i > b-k) System.out.println(i);
		}
	}
}
