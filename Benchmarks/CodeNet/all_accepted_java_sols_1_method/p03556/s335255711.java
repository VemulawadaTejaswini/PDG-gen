import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int result = 0;
		for(int i=n; i>0; i--){
			if(Math.sqrt(i) == (int)Math.sqrt(i)){
				result = i;
				break;
			}
		}
		System.out.println(result);
	}
}
