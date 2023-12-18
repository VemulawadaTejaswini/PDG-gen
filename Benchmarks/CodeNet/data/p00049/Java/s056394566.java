import java.util.*;
public class Main {
	Scanner sc;
	String[] type ={"A", "B", "AB", "O"};
	
	void run() {
		sc = new Scanner(System.in);
		HashMap<String,Integer> map = new HashMap<String, Integer>();
		while (sc.hasNext()) {
			String str = sc.next().split(",")[1];
			if(map.containsKey(str)) map.put(str, map.get(str)+1);
			else map.put(str, 1);
		}
		for(int i=0;i<4;i++) System.out.println(map.get(type[i]));
	}
	public static void main(String[] args) {
		new Main().run();
	}
	
}