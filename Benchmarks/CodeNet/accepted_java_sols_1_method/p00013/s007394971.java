import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		Deque<Integer> stack = new ArrayDeque<Integer>();
		while(true){
			try{
				int N = in.nextInt();
				if(N == 0){
					System.out.println(stack.pop());
					stack.peek();
				}else{
					stack.push(N);
				}
			}catch(Exception e){
				System.exit(0);
			}
		}
	}
}