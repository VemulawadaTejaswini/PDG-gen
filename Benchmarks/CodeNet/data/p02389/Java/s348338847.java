import java.util.Scanner;

class Main{

public static int area(int x, int y) {
	return x* y;
	}
public static int perimeter(int x, int y) {
	return x + x + y + y;
	}
	
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int p = scanner.nextInt();
int q = scanner.nextInt();

System.out.println(area(p,q) + " " + perimeter(p,q));
}
}

