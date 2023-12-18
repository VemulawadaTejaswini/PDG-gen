import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		int n = sc.nextInt();
		int[] x = new int[n];
		
		for(int i = 0; i < n; i++){
			
			String[] str = new String[2];
			 str = sc.nextLine().split(" ");
			
			x[i] = Integer.parseInt(str[1]);
			map.put(Integer.parseInt(str[1]), Integer.parseInt(str[0]));
		}
		Arrays.sort(x);
		
		System.out.println(map.get(x[n - 1]) + " " + x[n - 1]);
		
		sc.close();
	}
}