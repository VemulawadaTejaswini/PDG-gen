import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
 int s = sc.nextInt();
 int sec=(s%3600)%60;
 int min=(s%3600)/60;
 int hour=s/3600;
System.out.println(hour+ ":"+min +":"+sec);
}}