import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		ArrayList<String> list=new ArrayList<String>();
		Stack<String> stack=new Stack<String>();
		for (int i = 0;; i++) {
			String[] s=br.readLine().split(" ");
			if(s.length==2){
				stack.add(s[1]);
			}else{
				if(s[0].equals("quit")){
					break;
				}else{
					list.add(stack.pop());
				}
			}
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}