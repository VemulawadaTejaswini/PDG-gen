import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedList<Integer> list = new LinkedList<Integer>();
		while(n-->0){
			switch(sc.next()){
				case "insert":
					list.addFirst(sc.nextInt());
					break;
				case "delete":
					int target = sc.nextInt();
					if(list.indexOf(target)!=-1){
						list.remove(list.indexOf(target));
					}
					break;
				case "deleteFirst":
					list.pollFirst();
					break;
				case "deleteLast":
					list.pollLast();
			}
		}
		String str = list.toString();
		str = str.replace(",", "");
		System.out.print(str.substring(1,str.length()-1));
	}
}
