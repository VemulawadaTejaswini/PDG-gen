
//import java.lang.Math;
import java.util.*;
//import java.util.ListIterator;
//import java.util.Iterator;
//import java.util.LinkedList;

class Main{

	public static void main(String[] arg) {

		Scanner sc = new Scanner(System.in);
		List<Sortingtuples> list = new ArrayList<Sortingtuples>();
		int cnt = sc.nextInt();

		for (int i = 0; i < cnt; i++) {

			int money = sc.nextInt();
			int weight = sc.nextInt();
			String type = sc.next();
			long date = sc.nextLong();
			String name = sc.next();

			list.add(new Sortingtuples(money, weight, type, date, name));
		}

		/*
		 * Sortingtuples sortingtuples; for (int i = 0; i < list.size(); i++) {
		 * for (int j = i + 1; j < list.size() - i - 1; j++) { if
		 * (list.get(j).getmoney() > list.get(j + 1).getmoney()) {
		 * 
		 * sortingtuples = list.get(j); list.set(j, list.get(j + 1)); list.set(j
		 * + 1, sortingtuples); } else if (list.get(j).getmoney() == list.get(j
		 * + 1).getmoney()) { if (list.get(j).getweight() > list.get(j +
		 * 1).getweight()) { sortingtuples = list.get(j); list.set(j, list.get(j
		 * + 1)); list.set(j + 1, sortingtuples);
		 * 
		 * } else if (list.get(j).getweight() == list.get(j + 1).getweight()) {
		 * if (list.get(j).gettype().compareTo(list.get(j + 1).gettype()) < 0) {
		 * sortingtuples = list.get(j); list.set(j, list.get(j + 1)); list.set(j
		 * + 1, sortingtuples); } else if
		 * (list.get(j).gettype().compareTo(list.get(j + 1).gettype()) == 0) {
		 * if (list.get(j).getdate() > list.get(j + 1).getdate()) {
		 * sortingtuples = list.get(j); list.set(j, list.get(j + 1)); list.set(j
		 * + 1, sortingtuples); } else if (list.get(j).getdate() == list.get(j +
		 * 1).getdate()) { if (list.get(j).getname().compareTo(list.get(j +
		 * 1).getname()) < 0) { sortingtuples = list.get(j); list.set(j,
		 * list.get(j + 1)); list.set(j + 1, sortingtuples); } } } }
		 * 
		 * } } }
		 */
		list.sort(Comparator.comparing(Sortingtuples::getmoney).thenComparing(Sortingtuples::getweight)
				.thenComparing(Sortingtuples::gettype).thenComparingLong(Sortingtuples::getdate)
				.thenComparing(Sortingtuples::getname));

		for (Sortingtuples demo : list) {
			System.out.println(demo);
		}

	}

}

class Sortingtuples {

	private int money;
	private int weight;
	private String type;
	private long date;
	private String name;

	public Sortingtuples(int money, int weight, String type, long date, String name) {
		this.money = money;
		this.weight = weight;
		this.type = type;
		this.date = date;
		this.name = name;
	}

	public int getmoney() {
		return money;
	}

	public int getweight() {
		return weight;
	}

	public String gettype() {
		return type;
	}

	public long getdate() {
		return date;
	}

	public String getname() {
		return name;
		
	}
	public String toString(){

        return money+" "+weight+" "+type+" "+date+" "+name;

}
}
