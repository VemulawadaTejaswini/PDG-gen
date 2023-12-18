import java.io.*;
import java.util.Arrays;
import java.util.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] fst = (br.readLine()).split(" ");
		int n = Integer.parseInt(fst[0]);
		int quan = Integer.parseInt(fst[1]);
		int sumtime = 0;
		Deque<Integer> stackint = new ArrayDeque<Integer>();
		Deque<String> stackst = new ArrayDeque<String>();
		for ( int i = 0; i<n ; i++ ) {
			String[] st = (br.readLine()).split(" ");
			stackst.addLast(st[0]);
			stackint.addLast(Integer.parseInt(st[1]));
		}
		int a;
		String b;
		try{
				// System.out.println("a");

			while((a = stackint.pollFirst()) > 0){
				b = stackst.pollFirst();
				if ( a <= quan) {
					sumtime = sumtime + a;
				// System.out.println("b");

					System.out.println(b + " " + sumtime);
				}else{
					sumtime = sumtime + quan;
					a = a - quan;
					stackint.addLast(a);
				// System.out.println("c");

					stackst.addLast(b);
				}
			}
		}catch (NullPointerException e){
				// System.out.println("d");

		}
	}
}