
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			final int r = sc.nextInt();
			
			if(n == 0 && r == 0){
				break;
			}
			
			LinkedList<Integer> list = new LinkedList<Integer>();
			for(int i = 0; i < n; i++){
				list.add(i+1);
			}
			Collections.reverse(list);
			
			LinkedList<Integer> tmp = new LinkedList<Integer>();
			for(int i = 0; i < r; i++){
				
				int p = sc.nextInt();
				int c = sc.nextInt();
				
				tmp.clear();
				
				for(ListIterator<Integer> ite = list.listIterator(p-1); c > 0 ;c--){
					int num = ite.next();
					ite.remove();
					tmp.add(num);
				}
				
				Collections.reverse(tmp);
				
				for(int t : tmp){
					list.addFirst(t);
				}
				
				
			}
			
			System.out.println(list.peek());
			
			
		}
		
	}

}