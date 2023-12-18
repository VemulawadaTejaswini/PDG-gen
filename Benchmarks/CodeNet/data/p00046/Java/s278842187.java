import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		LinkedList<Double> list=new LinkedList<Double>();
		while(sc.hasNext()) {
			list.add(sc.nextDouble());
		}
		Collections.sort(list);
		ln(list.get(list.size()-1)-list.get(0));
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}