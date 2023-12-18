import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int l = Integer.parseInt(sc.next());
		int r = Integer.parseInt(sc.next());
		int d = Integer.parseInt(sc.next());
		int count = 0;
		for(int i=l; i<=r; i++){
			if(i % d == 0) count++;
		}
		System.out.println(count);
	}
}
