import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int s = a*b;
			int syu = (a+b)*2;
			System.out.println(s + " " + syu);
		}
	}
}