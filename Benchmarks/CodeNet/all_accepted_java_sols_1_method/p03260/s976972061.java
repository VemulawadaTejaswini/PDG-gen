import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//int n = sc.nextInt();
		System.out.println(sc.nextInt() * sc.nextInt() % 2 != 0 ? "Yes" : "No");
	}
}
