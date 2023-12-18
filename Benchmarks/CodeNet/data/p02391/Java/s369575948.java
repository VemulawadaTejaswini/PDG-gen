import java.util.Scanner;

class Main{

public static void larger(int a, int b){
if (a > b) {
System.out.println("a > b");
} else if (b > a) {
System.out.println("b > a");
} else {
System.out.println("a == b");
}
}
	
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int p = scanner.nextInt();
larger(p);

}
}

