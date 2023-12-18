

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
	
	public static void main(String [] args){
		
		ArrayDeque<Integer> list = new ArrayDeque<Integer>();
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		String  str;
		String[] strings = new String [2];
		
		for(int i=0; i<n; i++){
			str = scanner.nextLine();
		
			if(str.charAt(0) == 'i'){
				strings  = str.split(" ");
				list.addFirst(Integer.parseInt(strings[1]));
			}else if(str.charAt(6) == ' '){
				strings  = str.split(" ");
				list.remove((Integer) Integer.parseInt(strings[1]));
			}else if("deleteFirst".equals(str)){
				list.removeFirst();
			}else{
				list.removeLast();
			}
			
		}
	
		System.out.print(list.pop());
		while(!list.isEmpty() ){
			System.out.print(" "+list.pop());
		}
		System.out.println();
 		scanner.close();
 		
	}

  
}