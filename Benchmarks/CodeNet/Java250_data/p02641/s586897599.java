import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		String[] nums = new String[n];
		for (int i = 0; i < n; i++){
			nums[i] = sc.next();
		}
		sc.close();
		for(int count = 0;;count++){
			if (!(Arrays.asList(nums).contains(String.valueOf(x-count)))){
				System.out.println(x-count);
				break;
			}
			if (!(Arrays.asList(nums).contains(String.valueOf(x+count)))){
				System.out.println(x+count);
				break;
			}
		}
	}
}
