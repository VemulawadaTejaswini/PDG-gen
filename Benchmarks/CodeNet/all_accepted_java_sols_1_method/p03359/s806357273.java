import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();

	int num = a-1;
	if(b >= a) num++;

	System.out.println(num);
}
}
