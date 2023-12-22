import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
    	int N = scanner.nextInt();
		int diff = 0;
		
		//自動ソートしてくれるset
		Set<Integer> treeSet = new TreeSet<>();
    	
		for (int i = 0; i < N; i++) {
			treeSet.add(scanner.nextInt());
		}
		
		try {
			//treeSetをlistに格納
			//Integer[] list = new Integer[N];
			//treeSet.toArray(list);
			
			Integer[] list = treeSet.toArray(new Integer[N]);
			
			int min = list[0];
			int max = list[list.length - 1];
			
			//System.out.println("min : " + min);
			//System.out.println("max : " + max);
			
			diff = max - min;
			System.out.println(diff);
		
		} catch (NullPointerException e) {
			//System.err.println("エラー" + e.getMessage());
			System.out.println(diff);
		}
	}
}