import java.io.IOException;
import java.util.Scanner;


public class Main{
	public static void main(String args[]) throws IOException{
		Scanner bf = new Scanner(System.in);
		String[] stack = new String[1000];
		int point = 0;
		while(true){
			String str = bf.next();
			if(str.equals("push")){
				stack[point] = bf.next();
				point++;
			}else if(str.equals("pop")){
				point--;
				System.out.println(stack[point]);
			}else if(str.equals("quit")){
				return;
			}
		}
	}
}