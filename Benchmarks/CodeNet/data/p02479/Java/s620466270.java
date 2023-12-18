import java.util.Scanner;

public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int r = sc.nextInt();
double pi = Math.PI;
double a = r * r * pi;
double s = 2 * r * pi;
System.out.println(a + " " + s);
}
}