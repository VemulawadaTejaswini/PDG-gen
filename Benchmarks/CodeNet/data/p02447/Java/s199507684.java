//import java.lang.Math;
import java.util.*;
//import java.util.ListIterator;
//import java.util.Iterator;
//import java.util.LinkedList;

class Main{

	public static void main(String[] arg) {

		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		List<Sorting> list = new ArrayList<Sorting>();

		for (int i = 0; i < cnt; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			list.add(new Sorting(x, y));

		}

		list.sort(Comparator.comparing(Sorting::getx).thenComparingInt(Sorting::gety));

		for (Sorting sorting : list) {
			System.out.println(sorting);
		}
	}
}

class Sorting{

	private int x;
	private int y;

	public Sorting(int x, int y) {
		this.x=x; 
		this.y=y;
		
	}	
	public int getx(){
		return x;
	}
	public int gety(){
		return y;
	}
	public String toString(){
		
		return x+" "+y;
	}
			
		}
		
