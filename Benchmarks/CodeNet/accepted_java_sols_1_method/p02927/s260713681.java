import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int m = Integer.parseInt(sc.next());
		int d = Integer.parseInt(sc.next());
		int count = 0;
		for(int i=22; i<=d; i++){
			if(i % 10 > 1 && (i / 10) * (i % 10) <= m){
				count++;
			}
		}
		System.out.println(count);
	}
}
