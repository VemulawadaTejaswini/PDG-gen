import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int[] foods = new int[m+1];
		for(int i=0; i<n; i++){
			int k = Integer.parseInt(sc.next());
			for(int j=0; j<k; j++){
				int a = Integer.parseInt(sc.next());
				foods[a]++;
			}
		}
		int count = 0;
		for(int f : foods){
			if(f == n){
				count++;
			}
		}
		System.out.println(count);
	}
}
