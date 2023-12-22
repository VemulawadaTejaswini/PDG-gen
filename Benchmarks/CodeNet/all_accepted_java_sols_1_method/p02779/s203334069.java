import java.util.*;
public class Main {
	public static void main(String[] args){
      	
		Scanner sc = new Scanner(System.in);
		//String word_before = sc.next();
		int N = sc.nextInt();
		int num_arr[] = new int[N];
		boolean flag = true;
		for (int i = 0; i < num_arr.length; i++) {
			num_arr[i] = sc.nextInt();
		}
		Arrays.sort(num_arr);
		for (int i = 0; i < num_arr.length-1; i++) {
			if(num_arr[i] ==num_arr[i+1]){
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
      	
		
      	
    }
		
}