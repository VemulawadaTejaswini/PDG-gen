import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int w = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int ans = 0;
		if(a < b){
			if(b > a + w){
				ans = b - (a + w);
			}
		}else{
			if(a > b + w){
				ans = a - (b + w);
			}
		}
		System.out.println(ans);
	}
}
