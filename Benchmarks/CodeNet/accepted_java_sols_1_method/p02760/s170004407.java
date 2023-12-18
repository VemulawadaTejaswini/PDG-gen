import java.util.*; 
import java.io.*; 
public class Main{
	public static void main(String ...strings ) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[3][3]; 
		
		for(int i = 0; i<3; i++) 
			for(int j = 0; j<3; j++) 
				arr[i][j] = sc.nextInt(); 
			
		HashMap<Integer,Integer> map = new HashMap<>(); 
		int n = sc.nextInt(); 
		
		for(int i = 0; i<n; i++) {
			int x = sc.nextInt(); 
			map.put(x, x); 
		}
		
		if(map.containsKey(arr[0][0]) && map.containsKey(arr[1][0]) && map.containsKey(arr[2][0]))
			System.out.println("Yes"); 
		else if(map.containsKey(arr[0][1]) && map.containsKey(arr[1][1]) && map.containsKey(arr[2][1]))
			System.out.println("Yes"); 
		else if(map.containsKey(arr[0][2]) && map.containsKey(arr[1][2]) && map.containsKey(arr[2][2]))
			System.out.println("Yes"); 
		else if(map.containsKey(arr[0][0]) && map.containsKey(arr[0][1]) && map.containsKey(arr[0][2]))
			System.out.println("Yes"); 
		else if(map.containsKey(arr[1][0]) && map.containsKey(arr[1][1]) && map.containsKey(arr[1][2]))
			System.out.println("Yes"); 
		else if(map.containsKey(arr[2][0]) && map.containsKey(arr[2][1]) && map.containsKey(arr[2][2]))
			System.out.println("Yes"); 
		else if(map.containsKey(arr[0][0]) && map.containsKey(arr[1][1]) && map.containsKey(arr[2][2]))
			System.out.println("Yes"); 
		else if(map.containsKey(arr[0][2]) && map.containsKey(arr[1][1]) && map.containsKey(arr[2][0]))
			System.out.println("Yes"); 
		else System.out.println("No"); 
	}
}