import java.io.BufferedReader;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException{
		Deque<Integer> stack = new ArrayDeque<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String N = br.readLine();
			char[] P = N.toCharArray();
			if(P[0] == '.')break;
			for(int i = 0;i < P.length;i++){
				if(P[i] == ('(')){
					stack.push(1);
				}else if(P[i] == ('[')){
					stack.push(2);
				}else if(P[i] == (')')){
					if(stack.pop() == 1){
						stack.peek();
					}else{
						System.out.println("no");
						break;
					}
				}else if(P[i] == (']')){
					if(stack.pop() == 2){
						stack.peek();
					}else{
						System.out.println("no");
						break;
					}
				}
				if(i == P.length-1)System.out.println("yes");
			}
		}
	}
}