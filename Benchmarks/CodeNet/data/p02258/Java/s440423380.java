import java.util.Scanner;
public class Main {
	static int dmin = -1000000000;
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i=0; i < n; i++){
			nums[i] = sc.nextInt();
		}
		
		int mp = dmin;
		for(int i=0; i < n; i++){
			for(int j=i+1; j < n; j++){
				int p = nums[j] - nums[i];
				if(mp < p) mp = p;
			}
		}
		System.out.println(mp);
	}
}