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
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		while(true){
			int in1 = sc.nextInt();
			int in2 = sc.nextInt();
			if(in1 == 0 && in2 == 0) break;
			if(in1 > in2){
				int d = in1;
				in1 = in2;
				in2 = d;
			}
			System.out.println(in1 + " " + in2);
		}
	}
}
