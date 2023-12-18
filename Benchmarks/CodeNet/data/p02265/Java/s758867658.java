import java.util.LinkedList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author kawakami
 *
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		Scanner as = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		int n = 0;
		int index = 0;
		
		
		n = Integer.parseInt(as.next());
		
		while(as.hasNext()){
			
			switch (as.next()){
			case "insert"      :
				list.addFirst(Integer.parseInt(as.next()));
				break;
				
			case "delete"      :
				index = list.indexOf(Integer.parseInt(as.next())); 
				if(index != -1){
					
					list.remove(index);
					
				}
				break;
				
			case "deleteFirst" :
				list.removeFirst();
				break;
				
			case "deleteLast"  :
				list.removeLast();
				break;
				
				
			}
			
		}
		
		for(int i=0;i<list.size();i++){
			
			if(i != list.size()-1){
				
				sb.append(list.get(i)).append(" ");
			
			}
			else{
				
				sb.append(list.get(i));
				
			}
			
		}
		
		System.out.println(sb.toString());

	}

}