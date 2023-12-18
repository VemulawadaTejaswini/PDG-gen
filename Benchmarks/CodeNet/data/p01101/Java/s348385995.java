import java.util.*;
class Main {
	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);    
			
			while(true){

			int n = in.nextInt();
			int m = in.nextInt();

			if (n == 0 && m == 0)break;

			int result = 0, now = 0;
			int[] a = new int[n];

			for (int i = 0; i < a.length; i++) {
				a[i] = in.nextInt();
			}

			for (int i = 0; i < a.length; i++) {
				for (int j = i + 1; j < a.length; j++) {
					now = a[i] + a[j];
					if (now <= m && now > result) {
						result = now;
					}
				}
			}

			if (result == 0) {
				System.out.println("NONE");
			}else{
				System.out.println(result);
			}
		}

	}
}