import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String str = sc.nextLine();
		
		int[] arr = new int[4];
		
		for(char c : str.toCharArray()){
			if(c == 'N') arr[0]++;
			else if(c == 'S') arr[1]++;
			else if(c == 'E') arr[2]++;
			else if(c == 'W') arr[3]++;
		}
		
		if(arr[0] == 0 && arr[1] !=0){
			System.out.println("No");
		}
		else if(arr[0] != 0 && arr[1] == 0){
			System.out.println("No");
		}
		else if(arr[2] != 0 && arr[3] == 0){
			System.out.println("No");
		}
		else if(arr[3] != 0 && arr[2] == 0){
			System.out.println("No");
		}
		else System.out.println("Yes");
		
//		if(arr[0] == arr[1] && arr[2] == arr[3]) System.out.println("Yes");
//		else System.out.println("No");
		
	}
}
