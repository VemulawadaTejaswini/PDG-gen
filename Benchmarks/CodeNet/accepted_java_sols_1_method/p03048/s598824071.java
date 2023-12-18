import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] str = reader.readLine().split(" ");
		int[] ab = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			ab[i] = Integer.parseInt(str[i]);
		}

		int ans = 0;
		int count = 0;   //////////////
		//		for (int r = 0; r <= ab[3]/ab[0]; r++) {
		//			for (int g = 0; g <= (ab[3] - ab[0] * r)/ab[1]; g++) {
		//				for (int b= 0; b <= (ab[3] - ab[0] * r - ab[1] * g)/ab[2]; b++) {
		//					count++; //////////////////
		//					if (ab[0] * r + ab[1] * g + ab[2] * b == ab[3]) {
		//						ans++;
		//					}
		//				}
		//			}
		//		}

//		outer:
//		for (int r = 0; r <= ab[3]/ab[0]; r++) {
//			boolean flag2 = false;
//				if (ab[0] * r == ab[3]) {
//					ans++;
//					break outer;
//				}
//			for (int g = 0; g <= (ab[3] - ab[0] * r)/ab[1]; g++) {
//				if (ab[0] * r + ab[1] * g == ab[3]) {
//					ans++;
//					flag2 = true;
//					
//				}
//				if (!flag2) {
//					for (int b= 0; b <= (ab[3] - ab[0] * r - ab[1] * g)/ab[2]; b++) {
//						count++; //////////////////
//						if (ab[0] * r + ab[1] * g + ab[2] * b == ab[3]) {
//							ans++;
//						}
//					}
//				}
//			}
//		}
		
		//割った余り
		//for 文の最後を工夫
		//outerを2つ
		//for 文をそもそも2回に減らす
		for (int r = 0; r <= ab[3]/ab[0]; r++) {
			for (int g = 0; g <= (ab[3] - ab[0] * r)/ab[1]; g++) {
				if ((ab[3] - ab[0] * r - ab[1] * g) % ab[2] == 0) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
