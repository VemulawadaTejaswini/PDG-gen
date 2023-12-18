import java.util.Scanner;

public class Main {
public static void main(String[] args) {
System.out.println("Input a number");
Scanner sc = new Scanner(System.in);

int x = sc.nextInt();
int answer = x*x*x;
System.out.println(answer);
}
}
