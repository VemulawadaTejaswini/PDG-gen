import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String t = sc.next();
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		if(sc.next().equals(s)){
			a--;
		}else{
			b--;
		}
		System.out.println(a + " " + b);
	}
}
