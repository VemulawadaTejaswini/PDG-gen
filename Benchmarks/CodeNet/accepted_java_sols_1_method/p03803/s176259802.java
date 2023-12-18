import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		String result = "";
		if(a == b){
			result = "Draw";
		}else if(a > b){
			result = b != 1 ? "Alice" : "Bob";
		}else{
			result = a != 1 ? "Bob" : "Alice";
		}
		System.out.println(result);
	}
}
