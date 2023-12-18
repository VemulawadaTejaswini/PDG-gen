

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
	
	public static void main(String [] args){
		
		ArrayDeque<Integer> list = new ArrayDeque<Integer>();
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		String [] strs = new String[n];
		String[] strings = new String [2];
		
		for(int i=0; i<n; i++){
			strs[i] = scanner.nextLine();
		}
		
		
		for(int i=0; i<n; i++){
			if(strs[i].charAt(0) == 'i'){
				strings  = strs[i].split(" ");
				list.addFirst(Integer.parseInt(strings[1]));
			}else if(strs[i].charAt(6) == ' '){
				strings  = strs[i].split(" ");
				list.remove((Integer) Integer.parseInt(strings[1]));
			}else if("deleteFirst".equals(strs[i])){
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