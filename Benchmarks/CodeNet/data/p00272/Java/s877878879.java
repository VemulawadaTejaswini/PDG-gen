import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] k = new int[]{0,6,4,3,2};
		
		for(int i=0;i<4;i++){
			int t = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(k[t]*n*1000);
		}
	}
}