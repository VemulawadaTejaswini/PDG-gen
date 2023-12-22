import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());
		int t = Integer.parseInt(sc.next());
		long time = 0;
		while(n > 0){
			n -= x;
			time += t;
		}
		System.out.println(time);
	}
}
