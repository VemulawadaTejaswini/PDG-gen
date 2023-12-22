import java.util.*;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String a,b,c;
		a = scan.next();
		b = scan.next();
		c = scan.next();
		
		List<String> list = new ArrayList<String>();
		list.add (a);
		list.add (b);
		list.add (c);
		
		Collections.sort(list);
		
		System.out.println(list.get(0) + " " + list.get(1) + " " + list.get(2));
		
	}
}