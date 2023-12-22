import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		System.out.println(!list.contains(1) ? 1 : (!list.contains(2) ? 2 : 3));
	}
}
