
import java.io.*;
import java.util.*;

// æ­Ôá¤Æ±ë
// âè¶É¢ÄÈ­ÄàâèZbgÍ¡Åæªª0ÅI¹Å éB
// âèZbgÌJèÔµÉú»Rê

// 2011/10/16


//@2275  Fox Number
public class Main {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		
//		for(int loop = 0;; loop++) {

			//List<Bar> list = new ArrayList<Bar>();

			String s = reader.readLine();
			String[] sp = s.split(" ");
			long A = Long.parseLong(sp[0]);
			long B = Long.parseLong(sp[1]);
//			long A = 1000 * 1000 * 1000;
//			long B = 500000;
//			A = 123456;
//			B = 789;
			
//			if (N == 0)
//				break;
			
			int foxCnt = 0; // foxÌ
			for(long i = A - B; i <= A + B; i++) {
				
				boolean dame = false;
				long t = i;
				long k = 999999999; // ¼OÌ×«·¤
				for(long p = 2;; p++) {
					if (p != 2 && p % 2 == 0)
						continue; // ô« ¬»
					if (p * p > t)
						break;
					int c = 0; // ×«
					while(t % p == 0) {
						t /= p;
						c++;
					}
					if (c > k) {
						dame = true;
						break;
					}
					if (c != 0) {
						k = c;
					}
				}
				if (!dame) {
//					System.out.printf("%d isFox\n", i);
					foxCnt++;
				}
			}

			System.out.printf("%d\n", foxCnt);
				
//		}		
		
		reader.close();
	}

}