import java.util.Scanner;


public class Main {
public static void main(String[] args) {

	int a = 0;
	int b = 0;
	int menseki;
	int syuu;


	Scanner sc = new Scanner(System.in);
	 a = sc.nextInt();
	 b = sc.nextInt();

	 menseki = a * b;
	 syuu = a * 2 + b * 2;

	 System.out.println(menseki + " " + syuu);

 }
}