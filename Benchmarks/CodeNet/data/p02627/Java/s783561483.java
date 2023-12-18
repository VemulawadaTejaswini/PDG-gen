import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	char a = s.charAt(0);
	int x = (int) a;
	if (x>=65&&x<=90) System.out.println("A");
	else System.out.println("a");
	sc.close();}}