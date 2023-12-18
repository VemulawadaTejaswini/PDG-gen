import java.util.Scanner;

class Main{

public int area(int x, int y) {
	return x* y;
	}
public int perimeter(int x, int y) {
	return x + x + y + y;
	}
	
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int p = scanner.nextInt();
int q = scanner.nextInt();

System.out.print(perimeter(p,q) + " " + area(p,q));
}
}

