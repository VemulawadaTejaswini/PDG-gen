import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		Integer[] a = new Integer[n];
		Arrays.setAll(a, i -> Integer.parseInt(sc.next()));
		int count = 0;
		for(int i=0; i<n; i++){
			if(i % 2 != 0 && a[i] % 2 != 0) count++;
		}
		System.out.println(count);
	}
}
