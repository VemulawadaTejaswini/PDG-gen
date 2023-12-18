import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> lst = new ArrayList<Integer>();
		for(int i=0; i<10; i++)	lst.add(in.nextInt());
		Collections.sort(lst);
		System.out.println(lst.get(9));
		System.out.println(lst.get(8));
		System.out.println(lst.get(7));
	}
}