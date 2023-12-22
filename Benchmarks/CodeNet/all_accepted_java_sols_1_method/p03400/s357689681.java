import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int d = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());
		int[] a = new int[n];
		Arrays.setAll(a, i -> Integer.parseInt(sc.next()));
		int count = 0;
		for(int i=0; i<n; i++){
			count += (d - 1) / a[i] + 1;
		}
		System.out.println(x + count);
	}
}
