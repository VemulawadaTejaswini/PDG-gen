import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	
	public static Scanner sc = new Scanner(System.in);
	
	void run() {
		List<Integer> list = new ArrayList<Integer>();
		
		while (sc.hasNextInt()) {
			list.add(sc.nextInt());
		}
		
		Collections.sort(list);
		
		System.out.println(list.get(list.size()-1));
		System.out.println(list.get(list.size()-2));
		System.out.println(list.get(list.size()-3));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().run();
	}

}