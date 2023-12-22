	
	import java.util.*;
	
	public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        Set<String> set = new HashSet<>();
			while(n-->0) set.add(sc.next());
			System.out.println(set.size());
	}
}
	