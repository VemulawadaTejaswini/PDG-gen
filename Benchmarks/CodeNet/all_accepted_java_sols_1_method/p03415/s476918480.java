import java.util.ArrayList;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] numList = new char[9];
		for(int i = 0; i < 3 ; i++){
			String tmp = sc.next();
			char a = tmp.charAt(i);
			numList[i] = a;
		}
		System.out.println(String.valueOf(numList[0]) + String.valueOf(numList[1]) + String.valueOf(numList[2]));
		
	}
}