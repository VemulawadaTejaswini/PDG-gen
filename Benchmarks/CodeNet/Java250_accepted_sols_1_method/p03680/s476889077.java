import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] as = new int[n];
		
		for(int i=0; i<as.length; i++) {
			as[i] = sc.nextInt()-1;
		}
		sc.close();
		
		int count = 0;
		int light = 0;
		
		for(int i=0; i<as.length; i++) {
			count += 1;
			light = as[light];
			
			if(light == 1) {
				break;
			}
		}
		
		if(count == as.length) {
			System.out.println(-1);
		}else {
			System.out.println(count);
		}

	}

}
