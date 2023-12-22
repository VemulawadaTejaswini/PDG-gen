import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean left_init = false;
		int cur = 0;
		
		while(true){
			String in = sc.next();
			
			
			if("=".equals(in)){
				System.out.println(cur);
				break;
			}else if("+".equals(in)){
				int next = sc.nextInt();
				
				cur += next;
			}else if("-".equals(in)){
				int next = sc.nextInt();
				
				cur -= next;
			}else if("*".equals(in)){
				int next = sc.nextInt();
				
				cur *= next;
			}else if("/".equals(in)){
				int next = sc.nextInt();
				
				cur /= next;
			}else{
				int input = Integer.parseInt(in);
				if(!left_init){
					cur = input;
					left_init = true;
				}
			}
		}
	}

}