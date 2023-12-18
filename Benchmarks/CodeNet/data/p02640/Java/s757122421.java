import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x =sc.nextInt(),y =sc.nextInt();
	if (y>4*x||y%2==1) System.out.println("No");
	else System.out.println("Yes");
	sc.close();}}
