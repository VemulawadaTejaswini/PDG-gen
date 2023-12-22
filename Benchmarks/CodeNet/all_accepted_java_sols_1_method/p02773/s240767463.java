import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String[] moji = new String[N];
		List<String> list = new ArrayList<String>();
		//HashMap<String,String> map = new HashMap<String,String>();
		for(int i = 0; i <= N; i++) {
			list.add(sc.nextLine());
		}
		Map<String, Long> map2 =
		          list.stream().collect(
		                    Collectors.groupingBy(x -> x, Collectors.counting())
		            );
		//文字が入っている
		         List<String> Moji = new ArrayList(map2.keySet());
		         List<Long> count = new ArrayList(map2.values());
		         List<String> anser = new ArrayList<String>();
		         long max = Collections.max(count);

		         for(int i = 0; i< count.size(); i++) {
		        	 if(max == count.get(i)) {
		        		 anser.add(Moji.get(i));
		        	 }
		         }
		         Collections.sort(anser);
		         for(String val : anser) {
		        	 System.out.println(val);
		         }
		         //System.out.println(anser);
		 //list.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
	}
}
