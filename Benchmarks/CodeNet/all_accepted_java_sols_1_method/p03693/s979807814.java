import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next() + sc.next() + sc.next());
		System.out.println(a % 4 == 0 ? "YES" : "NO");
	}
}
