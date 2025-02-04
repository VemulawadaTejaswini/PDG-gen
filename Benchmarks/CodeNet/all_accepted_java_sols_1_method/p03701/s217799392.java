import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] points = new int[N];
		int ans = 0;
		
		for(int i=0; i<N; i++){
			int s = sc.nextInt();
			points[i] = s;
			ans += s;
		}
		
		if(ans % 10 != 0){
			System.out.println(ans);
		}else{
			Arrays.sort(points);
			boolean flag = false;
			for(int i=0; i<N; i++){
				int min = points[i];
				if(points[i] % 10 != 0){
					System.out.println(ans - min);
					flag = true;
					break;
				}
			}
			if(!flag){
				System.out.println(0);
			}
		}
		
		
	}

}