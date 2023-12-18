import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		final Scanner sc = new Scanner(System.in);

		String left = "qwertasdfgzxcvb";
		String right = "yuiophjklnm";
		
		while(true){
			String input = sc.next();
		
			if("#".equals(input)){
				break;
			}
			
			int count = -1;
			boolean be_l = false;
			for(char c : input.toCharArray()){
				boolean left_b = false;
				
				for(char l : left.toCharArray()){
					if(c == l){
						left_b = true;
						break;
					}
				}
				
				if(count == -1){
					count = 0;
				}else if(be_l != left_b){
					count++;
				}
				be_l = left_b;
			}
			
			System.out.println(count);
			
		}
		
		
	}

}