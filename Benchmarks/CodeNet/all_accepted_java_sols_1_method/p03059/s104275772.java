import java.util.Scanner;
public class Main {
	 public static void main(String args[]){
		 Scanner std = new Scanner(System.in);
		 int a = std.nextInt();
		 int b = std.nextInt();
		 int t = std.nextInt();
		 int count = t / a;
		 System.out.println(count * b);
	 }
}
