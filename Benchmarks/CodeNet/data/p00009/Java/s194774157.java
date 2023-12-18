
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author DemonSong
 * 
 *         9.Prime Number
 * 
 *         Prime Number Write a program which reads an integer n and prints the
 *         number of prime numbers which are less than or equal to n. A prime
 *         number is a natural number which has exactly two distinct natural
 *         number divisors: 1 and itself. For example, the first four prime
 *         numbers are: 2, 3, 5 and 7.
 * 
 *         Input Input consists of several datasets. Each dataset has an integer
 *         n (1 ??? n ??? 999,999) in a line.
 * 
 *         The number of datasets is less than or equal to 30.
 * 
 *         Output For each dataset, prints the number of prime numbers.
 * 
 *         Sample Input 10 3 11 Output for the Sample Input 4 2 5
 *
 */
public class Main{
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while (in.hasNext()){
			int num = in.nextInt();
			System.out.println(seive(num));
		}
		in.close();
	}
	static int MAX = 999999 + 16;
	static int[] prime;
	static boolean[] isPrime;
	
	public static int seive(int n){
		isPrime = new boolean[MAX];
		prime = new int[MAX + 1];
		Arrays.fill(isPrime, true);
		isPrime[0] = isPrime[1] = false;
		int cnt = 0;
		for (int i = 2; i <= n; ++i){
			if (isPrime[i]){
				prime[cnt++] = i;
				for (int j = 2 * i; j <= n; j += i){
					isPrime[j] = false;
				}
			}
		}
		return cnt;
	}
}