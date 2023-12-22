import java.util.Scanner;
//import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long happy = (x / 500) * 1000;
		x %= 500;
		happy += (x / 5) * 5;
		System.out.println(happy);
	}
}
