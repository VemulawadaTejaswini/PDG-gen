import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {


			int n = sc.nextInt();
			int k = sc.nextInt();

			int[] pArray = new int[n];
			long[] cArray = new long[n];

			for(int i = 0 ; i < n ; i++ ) {
				pArray[i] = sc.nextInt();
			}

			for(int i = 0 ; i < n ; i++ ) {
				cArray[i] = sc.nextLong();
			}

			//re order cArray by pArray's

			long max = Long.MIN_VALUE;
			//calc by start point
			for(int i = 0 ; i < n ; i++ ) {
				//calc until k or revisit start point
				int cnt = 0;
				int po = i;
				long score = 0;
				while(cnt < k) {
					//next
					po = pArray[po] - 1;
					cnt++;
					score += cArray[po];
					if ( score > max ) {
						max = score;
					}
//					System.out.println("## " + i + "," + cnt + ":" + score);
					if ( po == i ) {
						//found loop
						if ( score > 0 ) {							
							int loopCnt = k / cnt;
							score += score * (loopCnt-1);
							cnt += (loopCnt-1) * cnt;
							if ( score > max ) {
								max = score;
							}
						}
						else {
							break;
						}
					}
				}
//				System.out.println(cnt + ":" + score);
			}
			
			System.out.println(max);

		}
	}

}