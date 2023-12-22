import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N,M;
		N= sc.nextInt();
		M = sc.nextInt();
		ArrayList<AbstractMap.SimpleEntry<Long,Integer>> list = new ArrayList<AbstractMap.SimpleEntry<Long,Integer>>();
		for(int i = 0; i<N; i++) {
			list.add( new AbstractMap.SimpleEntry<Long, Integer>(sc.nextLong(),sc.nextInt()) );
		}
		list.sort(Comparator.comparing(AbstractMap.SimpleEntry::getKey));
		long ans = 0;
		int count = 0;
		for(AbstractMap.SimpleEntry<Long,Integer> pair : list) {
			if(pair.getValue() < M-count) {
				count += pair.getValue();
				ans += pair.getKey()*pair.getValue();
			} else {
				ans += (M-count) * pair.getKey();
				break;
			}
		}
		System.out.println(ans);
	}

}
