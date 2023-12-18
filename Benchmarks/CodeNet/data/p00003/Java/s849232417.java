import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int N = scan.nextInt();
		int[] tri = new int[3];
		boolean flag = false;
		for(int i = 0; i < N; i++){
			for(int j = 0; j < 3; j++){
				tri[j] = scan.nextInt();
			}
			for(int j = 0; j < 3 - 1; j++){
				for(int k = 3 - 1; k > j; k--){
					if(tri[k] > tri[j]){
						int big = tri[k];
						tri[k] = tri[j];
						tri[j] = big;
					}
				}
			}
			if(Math.pow(tri[0], 2) == Math.pow(tri[1], 2) + Math.pow(tri[2], 2)){
				flag = true;
			}
			System.out.println(flag? "YES" : "NO");
		}
	}
}