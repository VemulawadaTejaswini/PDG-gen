import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Integer first = sc.nextInt();
		Integer second = sc.nextInt();
		int kurai = String.valueOf(first+second).length();
		System.out.println(kurai);
		sc.close();
	}

}