import java.util.*;

public class Main {
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int y = sc.nextInt();
		
		int[]a = new int[y];
		
		for (int i = 0;i < y; i++){
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		
		System.out.println(Math.max(a[y-1]-(x-a[y-1])-1, 0));
		
		sc.close();
	}
}
