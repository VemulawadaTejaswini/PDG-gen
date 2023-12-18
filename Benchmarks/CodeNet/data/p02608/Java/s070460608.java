import java.util.Scanner;
import java.util.TreeMap;


public class Main {
//	final static int MOD = 1000000007;

	public static long ans = 0;

	public static void main(String[] args) {

//		int ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

//		long a = sc.nextLong();

		int n = sc.nextInt();


		//-------------------------------------------------------------------------------------
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for(int i = 0; i <= n; i++) {
			map.put(i, 0);
		}

		for(int i = 1; i < 102; i++) {
			for(int j = 1; j < 102; j++) {
				for(int l = 1; j < 102; l++) {
					int calc = i * i + j * j + l * l + i * l + i * j + j * l;
					if(calc > 0 && calc <= n) {
						map.put(calc, 1 + map.get(calc));
					}
				}
			}
		}

		for(int i = 1; i <= n; i++) {
			map.get(i);
		}
		//-------------------------------------------------------------------------------------

//		if(f) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("No");
//		}

		System.out.println(ans);

		sc.close();
	}



}