import java.util.LinkedList;
import java.util.Scanner;

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
		
		int a,b;
		int top = -1;
		String st = "";
		
		while(as.hasNext()){
			
			st = as.next();
			switch (st){
			case "+":
				a = list.remove(top);
				top--;
				b = list.remove(top);
				list.add(b+a);
				break;
				
			case "-":
				a = list.remove(top);
				top--;
				b = list.remove(top);
				list.add(b-a);
				break;
				
			case "*":
				a = list.remove(top);
				top--;
				b = list.remove(top);
				list.add(b*a);
				break;
				
			default :
				list.add(Integer.parseInt(st));
				top++;
			
			}
			
		}
		
		System.out.println(list.get(0).toString());

	}

}