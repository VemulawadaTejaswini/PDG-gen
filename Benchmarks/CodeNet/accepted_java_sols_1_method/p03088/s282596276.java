import java.util.*;
public class Main {

	/*
	 * 122D
	 * 
	 * This problem might be hard for students
	 *
	 * General Idea:
	 * This is a DP Problem and they should know how to MOD 1e9+7
	 * We note that only substrings with length 4 of
	 * ?AGC, ?ACG, ?GAC, A?GC, AG?C are not good (? means any character)
	 * So we can build our dp solution based on that
	 * DP[n][4th last character][3rd last character][2nd last character][last character]
	 * = number of good strings of length n and ends with those 4 characters
	 * The transition will be what happens when we append either character A G C T to it
	 * 
	 * Implementation Specific:
	 * This problem might be confusing to code because it has a lot of information
	 * Assume we are adding TTTT to the start of the string (This will not change our answer)
	 * So our initial case or base case is dp[0][T][T][T][T] = 1
	 * Also because storing character will use a lot of memory, we will compress it 
	 * A = 0, G = 1, C = 2, T = 3, ? = -1
	 * We will also store all the bad substrings encoded this way
	 * 
	 * Questions that might come up:
	 * Q: If ?AGC is bad then isn't AGC? also bad?
	 * A: Yes but this case is already covered by ?AGC
	 * Q: Do we have store the last 4 characters why not last 3 characters
	 * A: Yes you can also do it by storing last 3 characters.
	 *
	 * Time Complexity O(N * 4^4 * C) C is some large constant, Memory Complexity O(N * 4^4)
	 * 
	 */

	static char AGCT[] = {'A', 'G', 'C', 'T'};
	static int bad[][] = {{-1,0,1,2},{-1,0,2,1},{-1,1,0,2},{0,-1,1,2},{0,1,-1,2}};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long DP[][][][][] = new long[N+1][4][4][4][4];
		DP[0][3][3][3][3] = 1;
		for(int i = 0; i<N; i++) {
			for(int a = 0; a<4; a++) {
				for(int b = 0; b<4; b++) {
					for(int c = 0; c<4; c++) {
						for(int d = 0; d<4; d++) {
							//Those for loops above me control the state
							for(int e = 0; e<4; e++) {
								boolean good = true;
								for(int k = 0; k<5; k++) {
									boolean tempgood = true;
									tempgood &= (bad[k][0] == -1 ? true : bad[k][0] == b);
									tempgood &= (bad[k][1] == -1 ? true : bad[k][1] == c);
									tempgood &= (bad[k][2] == -1 ? true : bad[k][2] == d);
									tempgood &= (bad[k][3] == -1 ? true : bad[k][3] == e);
									if(tempgood) {
										good = false;
									}
								}
								if(good) {
									DP[i+1][b][c][d][e] += DP[i][a][b][c][d];
									DP[i+1][b][c][d][e] %= 1000000007;
								}
							}
						}
					}
				}
			}
		}
		long ans = 0;
		for(int a = 0; a<4; a++) {
			for(int b = 0; b<4; b++) {
				for(int c = 0; c<4; c++) {
					for(int d = 0; d<4; d++) {
						ans += DP[N][a][b][c][d];
						ans %= 1000000007;
					}
				}
			}
		}
		System.out.println(ans);
	}
}
