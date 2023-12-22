import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next()) + 1;
		long[] l = new long[n];
		l[0] = 2;
		l[1] = 1;
		for(int i=2; i<n; i++){
			l[i] = l[i-2] + l[i-1];
		}
		System.out.println(l[n-1]);
	}
}
