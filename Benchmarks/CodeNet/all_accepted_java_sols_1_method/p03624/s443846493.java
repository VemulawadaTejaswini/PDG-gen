import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String az = "abcdefghijklmnopqrstuvwxyz";
		for(int i = 0; i < az.length(); i++ ) {
			String f =  az.substring(i,i+1);
			if(s.indexOf(f)==-1) {
				System.out.println(f);
				System.exit(0);
			}
		}
		System.out.println("None");
	}

}
