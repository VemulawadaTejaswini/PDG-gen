
import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
	
	public static void main(String [] args){
		
		ArrayDeque<Integer> list = new ArrayDeque<Integer>();
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		String  str;
		StringBuilder builder = new StringBuilder();
		
		for(int i=0; i<n; i++){
			str = scanner.nextLine();
			if(str.charAt(0) == 'i'){
				list.push(Integer.parseInt(str.substring(7)));
			}else if(str.charAt(6) == ' '){
				list.remove((Integer) Integer.parseInt(str.substring(7)));
			}else if(str.charAt(6) == 'F'){
				list.removeFirst();
			}else{
				list.removeLast();
			}	
		}
		
		builder.append(list.poll());
		for(int num: list){
			builder.append(" ").append(num);
		}
		System.out.println(builder);
	}
  
}