import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char c = scan.next().charAt(0);
		scan.close();
		char x[]= {'a','e','i','o','u'};
		
		int check=0;
		for(int i=0;i<x.length;i++) {
			if(x[i]==c) {
				check=1;
				break;
			}
		}
		if(check==1)System.out.println("vowel");
		else System.out.println("consonant");
	}
}