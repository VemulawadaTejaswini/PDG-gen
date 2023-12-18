import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		int temp = 0;
		for(int x=1; x<100; x++){
			for(int y=1; y<100; y++){
				for(int z=1; z<100; z++){
					temp = x*x + y*y + z*z + x*y + y*z + z*x;
					if(temp <= n){
						a[temp - 1]++;
					}
				}
			}
		}
		Arrays.stream(a).forEach(System.out::println);
	}
}
