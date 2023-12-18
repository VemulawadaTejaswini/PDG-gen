import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        Integer a = scanner.nextInt();
        Integer b = scanner.nextInt();
        Integer c = scanner.nextInt();
 
        Integer temp = a;
        a = b;
        b = temp;
 
        temp = a;
        a = c;
        c = temp;
 
        System.out.format("%d %d %d", a, b, c);
    }
}