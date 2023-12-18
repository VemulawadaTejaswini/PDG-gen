import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {

			int n = sc.nextInt();

			TreeSet<Integer> list = new TreeSet<>();
			int[] numCount = new int[1000001];
			int max = 0;
			for (int i = 0; i < n; i++) {
				int value = sc.nextInt();
				numCount[value]++;
				list.add(value);
				max = Math.max(max, value);
			}

			if(numCount[1] > 1) {
				System.out.println(0);
				return;
			}else if(numCount[1] == 1) {
				System.out.println(1);
				return;
			}

			boolean[] dp = new boolean[max+1];
			for(int i = 1; i < dp.length; i++ ) {
				dp[i] = true;
			}

			for(int a : list) {
				for(int i = 2; a*i < max+1; i++) {
					dp[a*i] = false;
				}
			}

			int count = 0;
			for(int a: list) {
				if(numCount[a] == 1 && dp[a]) {
					count++;
				}
			}
			System.out.println(count);

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	static class Prime {
		public ArrayList<Long> primes = new ArrayList<>();
		public long max;

		public Prime(long max) {
			this.max = max;
			primes.add(2l);
			for (long i = 3; i <= max; i += 2) {
				if (isPrime(i))
					primes.add(i);
			}
		}

		public boolean isPrime(long value) {
			if (value <= 1l) {
				return false;
			} else if (value == 2l) {
				return true;
			}

			if(value % 2 == 0) return false;

			boolean flag = true;
			for (long i = 3l; i * i <= value; i += 2l) {
				if (value % i == 0) {
					flag = false;
					break;
				}
			}

			return flag;
		}

		public HashMap<Long,Integer> primeFact(long value){
			HashMap<Long,Integer> returns = new HashMap<>();
			int i = 0;
			int count = 0;
			if(primes.contains(value)) {
				returns.put(value, 1);
				return returns;
			}

			while(true) {
				if(value % primes.get(i) == 0) {
					count++;
					value /= primes.get(i);
				}else {
					if(count !=0) {
						returns.put(primes.get(i), count);
					}

					i++;
					count = 0;
				}

				if(value == 1) {
					returns.put(primes.get(i), count);
					break;
				}
			}


			return returns;
		}
	}

}

