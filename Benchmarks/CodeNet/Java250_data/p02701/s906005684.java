import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		HashSet<String> set = new HashSet<>();
		for(int i = 0;i < n; ++i){
			set.add(scan.next());
		}
		System.out.println(set.size());

	}

}
//end