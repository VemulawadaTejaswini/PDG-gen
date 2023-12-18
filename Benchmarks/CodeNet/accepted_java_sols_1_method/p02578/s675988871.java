import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		Arrays.setAll(a, i -> Integer.parseInt(sc.next()));
		long d = 0;
		for(int i=1; i<n; i++){
			if(a[i] < a[i-1]){
				int temp = a[i-1] - a[i];
				d += temp;
				a[i] += temp;
			}
		}
		
		System.out.println(d);
	}
}
