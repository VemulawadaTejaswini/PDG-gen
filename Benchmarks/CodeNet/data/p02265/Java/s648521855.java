import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){

		Deque<Integer> list = new LinkedList<Integer>();
		int n = scan.nextInt();
		String clear = scan.nextLine();
		clear = null;
		for(int i = 0; i < n; i++){
			String str = scan.nextLine();
			if(str.equals("deleteFirst"))
				list.remove();
			else if(str.equals("deleteLast"))
				list.removeLast();
			else{
				if(str.startsWith("insert"))
					list.addFirst(Integer.parseInt(str.substring(7)));
				else if(str.startsWith("delete"))
					list.remove(Integer.parseInt(str.substring(7)));
			}
		}
		StringBuffer sb = new StringBuffer(Integer.toString(list.poll()));
		for(int i : list){
			sb.append(" " + i);
		}
		String str = sb.toString();
		System.out.printf("%s\n", str);
	}
}