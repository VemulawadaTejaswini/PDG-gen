import java.util.Scanner;


public class Main {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int a= scanner.nextInt();
		int b= scanner.nextInt();
		System.out.println(Integer.toString(a*b)+" "+Integer.toString(a*2+b*2));
		scanner.close();
	}
}