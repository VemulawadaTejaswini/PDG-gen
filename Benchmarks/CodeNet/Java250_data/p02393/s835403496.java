import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;
 
/*
 * メモ
 * Scanner:nextは空白か改行までの単語
 * String[][] c = new String[h][w];
 * TemplateMain,"template_input.txt"
 * 0.5 == 1.0/2
 * Integer.valueOf(char)はダメ、(String)
 */
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a > b){
			int d = b;
			b = a;
			a = d;
		}
		if(a > c){
			int d = a;
			a = c;
			c = d;
		}
		if(b > c){
			int d = b;
			b = c;
			c = d;
		}
		System.out.println(a + " " + b + " " + c);
		
	}
}
