import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int x = Integer.parseInt(sc.next()) - Integer.parseInt(sc.next());
		System.out.println(x % Integer.parseInt(sc.next()));
	}
}
