import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long s = sc.nextLong();
		long left = 0;
		long right = (long) 1e17;
		while(left + 1 < right) {
			long c = (left + right) >>> 1;
			if (length(c) < s) {
				left = c;
			}else{
				right = c;
			}
		}
		int begin = (int) (s - length(left) - 1);
		System.out.println(fizzbuzzFrom(left + 1, 20).substring(begin, begin + 20));
	}

	public static long length(long x) {
		long sum = (x / 3 + x / 5) * 4;
		long min = 1;
		for(int i=0;i<18;i++) {
			if (x < min) break;
			long max = Math.min(x, min * 10 - 1);
			long nonFizzBuzz = nonFizzBuzz(max) - nonFizzBuzz(min - 1);
			sum += nonFizzBuzz * (i + 1);
			min *= 10;
		}
		return sum;
	}
	
	public static String fizzbuzzFrom(long x,int n) {
		StringBuilder sb = new StringBuilder();
		for(long i=x;i<x+n;i++) {
			if (x == 0) continue;
			if (i % 15 == 0) {
				sb.append("FizzBuzz");
			}else if(i % 3 == 0) {
				sb.append("Fizz");
			}else if(i % 5 == 0) {
				sb.append("Buzz");
			}else{
				sb.append(i);
			}
		}
		return sb.toString();
	}
	
	public static long nonFizzBuzz(long x) {
		return x - (x / 3 + x / 5 - x / 15);
	}
}