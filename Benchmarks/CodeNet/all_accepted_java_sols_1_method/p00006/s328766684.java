import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char a[] = new char[str.length()];
		for(int i = 0; i < str.length(); i++){
			a[i] = str.charAt(i);
		}
		for(int i = str.length() - 1; i >= 0; i--){
			System.out.print(a[i]);
		}
		System.out.println();
	}
}