import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int ain = sc.nextInt() * 3600 + sc.nextInt() * 60 + sc.nextInt();
		int aout = sc.nextInt() * 3600 + sc.nextInt() * 60 + sc.nextInt();
		int bin = sc.nextInt() * 3600 + sc.nextInt() * 60 + sc.nextInt();
		int bout = sc.nextInt() * 3600 + sc.nextInt() * 60 + sc.nextInt();
		int cin = sc.nextInt() * 3600 + sc.nextInt() * 60 + sc.nextInt();
		int cout = sc.nextInt() * 3600 + sc.nextInt() * 60 + sc.nextInt();
		
		int a = aout - ain;
		int b = bout - bin;
		int c = cout - cin;
		
		System.out.println(a / 3600 + " " + (a % 3600) / 60 + " " + ((a % 3600) % 60));
		System.out.println(b / 3600 + " " + (b % 3600) / 60 + " " + ((b % 3600) % 60));
		System.out.println(c / 3600 + " " + (c % 3600) / 60 + " " + ((c % 3600) % 60));
	}
}