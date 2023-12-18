import java.awt.geom.*;
import java.io.*;
import java.util.*;

import javax.naming.BinaryRefAddr;

public class Main {
	//1240 start
	//1354 stop
	ArrayList<Long> list, list2;

	private void doit(){
		Scanner sc = new Scanner(System.in);
		//test();
		init();
		while(sc.hasNext()){
			long n = sc.nextLong();
			int res = binaySearch(n);
			StringBuilder sb = new StringBuilder();
			long a = list.get(res);
			long value = n - a;
			long num = list2.get(res);
			for(long i = num; ; i++){
				if(i % 15 == 0){
					sb.append("FizzBuzz");
				}
				else if(i % 3 == 0){
					sb.append("Fizz");
				}
				else if(i% 5 == 0){
					sb.append("Buzz");
				}
				else{
					sb.append(i + "");
				}
				if(sb.length() + a >= n + 20){
					break;
				}
			}
			System.out.println(sb.substring((int) value, (int)value + 20));
//			for(int i = 0; i < 10; i++){
//				System.out.println(list.get(i));
//			}
		}
	}

	private int binaySearch(long patt){
		int mid, left = 0, right = list.size()-1;
		while(left <= right){
			mid = (left + right) / 2;
			if(list.get(mid) == patt){
				return mid;
			}
			if(list.get(mid) < patt){
				left = mid + 1;
			}
			else{
				right = mid - 1;
			}
		}
		return right;
	}

	private void test() {
		StringBuilder sb = new StringBuilder();
		for(int i = 1 ; i <= 1006; i++){
			if(i % 15 == 0){
				sb.append("fizzbuzz");
			}
			else if(i % 3 == 0){
				sb.append("fizz");
			}
			else if(i % 5 == 0){
				sb.append("buzz");
			}
			else{
				sb.append(i);
			}
			//System.out.println(sb.toString());
			//            if(i == 10){
			//                System.out.println(sb.length());
			//            }
		}
		//System.out.println(sb.toString());
		System.out.println("len = " + sb.length());
		System.out.println(sb.substring(3669 - 1));

	}
	private void init() {
		list = new ArrayList<Long>();
		list2 = new ArrayList<Long>();
		list.add(1L); list2.add(1L);
		list.add(310L); list2.add(100L);
		list.add(3670L); list2.add(1000L);
		boolean flg = false;
		for(long i = 1000, count = 4; count <= 18; i *= 10, count++){
			long prev = i;
			for(long j = i + (i/1000); j <= i * 10; j += (i/1000)){
				long now = j;
				long diff = now - prev ;
				long fizz = now / 3 - prev / 3;
				long buzz = now / 5 - prev / 5;

				long fizzbuzz = now / 15 - prev / 15;
				long sum = count * diff - fizz * count + fizz * 4 - buzz * count + buzz * 4 + count * fizzbuzz;
				long res = sum + list.get(list.size() - 1);
				list.add(res);
				list2.add(j);
				if(res >= 1.0e+18){
					flg = true;
					break;
				}
				prev = now;
			}
			if(flg) break;
		}
		//System.out.println(list);
	}

	private long pow(int x) {
		long res = 1;
		for(int i = 0; i < x; i++){
			res *= 10;
		}
		return res;
	}
	public static void main(String [] args){
		new Main().doit();
	}
}