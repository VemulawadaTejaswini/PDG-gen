import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int area = a*b;
int length = (a+b)*2;
System.out.println(area + " " + length);
}
}