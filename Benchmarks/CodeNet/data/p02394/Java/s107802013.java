import java.util.Scanner;

public class Main{

public static void sort(int W, int H, int x, int y, int r) {
int solved = 1;
if ((x + r > W) || ((x -r) < 0)) {
solved = 0;
}if ((y + r > H) || ((y -r) < 0)) {
solved = 0;
} if (solved = 0) {
System.out.println("No");
} else {
System.out.println("Yes");
}


} 
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int a = scan.nextInt();
int b = scan.nextInt();
int c = scan.nextInt();
int d = scan.nextInt();
int e = scan.nextInt();

sort(a, b, c, d, e);
}
}
