import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();

	if(-1000<=a && b<=1000){
		if(a<b){
			System.out.println("a < b");
		}
		else if (a > b){
			System.out.println("a > b");
		}
		else if (a == b){
			System.out.println("a == b");
		}
	}

	sc.close();
}
}