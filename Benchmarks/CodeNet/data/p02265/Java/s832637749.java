import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		final int q = sc.nextInt();
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i = 0; i < q; i++){
			final String ops = sc.next();
			
			if("insert".equals(ops)){
				final int x = sc.nextInt();
				list.addFirst(x);
			}else if("delete".equals(ops)){
				final int x = sc.nextInt();
				list.removeFirstOccurrence(x);
			}else if("deleteFirst".equals(ops)){
				list.removeFirst();
			}else if("deleteLast".equals(ops)){
				list.removeLast();
			}
		}
		
		boolean first = true;
		for(int i : list){
			if(first){
				first = false;
			}else{
				System.out.print(" ");
			}
			System.out.print(i);
		}
		System.out.println();
	}
}