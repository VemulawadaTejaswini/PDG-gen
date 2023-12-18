import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int top    = sc.nextInt();
		int front  = sc.nextInt();
		int left   = sc.nextInt();
		int right  = sc.nextInt();
		int back   = sc.nextInt();
		int bottom = sc.nextInt();
		
		final String input = sc.next();
		for(char c : input.toCharArray()){
			if(c == 'S'){
				int tmp = bottom;
				bottom = front;
				front = top;
				top = back;
				back = tmp;
			}else if(c == 'N'){
				int tmp = bottom;
				bottom = back;
				back = top;
				top = front;
				front = tmp;
			} else if(c == 'W'){
				int tmp = bottom;
				bottom = right;
				right = top;
				top = left;
				left = bottom;
			} else if(c == 'E'){
				int tmp = bottom;
				bottom = left;
				left = top;
				top = right;
				right = tmp;
			}
		}
		
		System.out.println(top);
	}
}