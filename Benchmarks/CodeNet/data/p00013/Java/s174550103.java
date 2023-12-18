import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("\\D+");
		
		Stack<Integer> a = new Stack<Integer>();
		
		while (scan.hasNext()) {
			int data = scan.nextInt();
			
			if(data != 0){
				a.push(data);
			}else
			{
				System.out.println(a.pop());
			}
		}
		scan.close();
	}
}