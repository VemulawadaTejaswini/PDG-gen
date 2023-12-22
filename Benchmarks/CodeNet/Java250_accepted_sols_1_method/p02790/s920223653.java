import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		String resultA = "";
		String resultB = "";
		for(int i=0; i<Integer.parseInt(b); i++){
			resultA += a;
		}
		for(int i=0; i<Integer.parseInt(a); i++){
			resultB += b;
		}
		System.out.println(resultA.compareTo(resultB) < 0 ? resultA : resultB);
	}
}
