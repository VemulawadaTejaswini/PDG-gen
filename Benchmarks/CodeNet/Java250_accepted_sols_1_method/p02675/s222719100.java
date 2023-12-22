import java.io.*;
import java.math.*;
import java.util.*;
public class Main { //Perform BFS from 2...N then use those values to print

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		x%=10;
		String ans = "";
		if (x==3) ans = "bon";
		else if (x==0||x==1||x==6||x==8) ans = "pon";
		else ans = "hon";
		System.out.println(ans);
	}	
}
