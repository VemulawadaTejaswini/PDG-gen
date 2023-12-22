import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < n; i++){
			LinkedList<Character> list = new LinkedList<Character>();
			ListIterator<Character> iter = list.listIterator();
			char[] array = sc.nextLine().toCharArray();
			
			iter.add(array[0]);
			boolean is_migi = true;
			for(int j = 1; j < array.length;){
				if(is_migi == false){
					iter.next();
					is_migi = true;
				}
				
				if(array[j+1] == '>'){
					if(iter.hasNext()){
						iter.next();
					}else{
						iter.add(array[j+2]);
					}
				}else{
					if(is_migi == true){
						iter.previous();
						is_migi = false;
					}
					
					if(iter.hasPrevious()){
						iter.previous();
					}else{
						iter.add(array[j+2]);
						is_migi = true;
					}
				}
				
				j += 3;
			}
			
			for(char c : list){
				System.out.print(c);
			}
			System.out.println();
			
		}
		
	}
	
}