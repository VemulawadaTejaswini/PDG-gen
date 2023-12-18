import java.util.*;
class Main {
	public static void main(String...args) {
		Scanner in = new Scanner(System.in);
		String str = "";
		while(true) {
			List<Integer> l = new ArrayList<Integer>();
			int from = in.nextInt(), to = in.nextInt();
			if((from|to) == 0) break;
			System.out.print(str);
			for(int i = from; i <= to; i++)
				if(i%400==0 || i%100!=0&&i%4==0) l.add(i);
			if(l.isEmpty()) System.out.println("NA");
			else for(int i = 0; i < l.size(); i++) System.out.println(l.get(i));
			str = "\n";
		}
	}
}