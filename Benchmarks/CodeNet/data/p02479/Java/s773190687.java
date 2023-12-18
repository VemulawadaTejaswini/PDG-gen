import java.util.Scanner;

public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
double a = sc.nextInt();
double area = a * a * Math.PI;
double circum = 2 * a * Math.PI;
System.out.println(area + " " + circum);
}
}