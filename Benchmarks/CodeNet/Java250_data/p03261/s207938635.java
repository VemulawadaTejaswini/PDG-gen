import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		List<String> list = new ArrayList<String>();
		String w = sc.next();
		list.add(w);
		boolean flag = true;
		
		for(int i = 0; i < N-1; i++){
			String W = sc.next();
			if(W.charAt(0) != w.charAt(w.length()-1)){
				flag = false;
				break;
			}
			if(list.contains(W)){
				flag = false;
				break;
			}
			list.add(W);
			w = W;
		}
		
		System.out.println(flag?"Yes":"No");
	}
}