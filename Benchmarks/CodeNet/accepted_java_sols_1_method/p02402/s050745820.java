import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sum = 0;
		List<Integer> list = new ArrayList<>(n);
		for(int i = 0;i < n; i++){
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		for(int data: list){
			sum += data;
		}
		System.out.printf("%d %d %d\n", list.get(0), list.get(list.size() -1), sum);
	}
}


