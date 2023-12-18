import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);


	public void run() {
		HashMap<String,Integer> map=new HashMap<String, Integer>();
		map.put("A",0);map.put("B",0);map.put("AB",0);map.put("O",0);
		while(sc.hasNext()) {
			String s=sc.next().split(",")[1];
			map.put(s,map.get(s)+1);
		}
		ln(map.get("A"));
		ln(map.get("B"));
		ln(map.get("AB"));
		ln(map.get("O"));
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