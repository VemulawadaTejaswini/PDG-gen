import java.util.Scanner;

public class Main{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int p = scan.nextInt();
int q = scan.nextInt();
int x = p / q;
int y = p % q;
double w = (double) p / q;
System.out.format("%d %d %f", x, y, w);
}
}
