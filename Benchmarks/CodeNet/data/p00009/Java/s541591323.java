import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		ArrayList<Integer> prime = new ArrayList<Integer>();
		int count = 0;
		
		try {
			while ((line = br.readLine()) != null) {
				line = line.trim();
				int num = Integer.parseInt(line);
				if (num < 0 || num > 999999)System.exit(-1);
				if(num >= 2) {
					int start = 3;
					//１つの素数は１回しか探さないようにする
					if(prime.size() == 0) {
						//初回
						prime.add(2);
						count++;
					} else {
						//２回目以降
						start = prime.get(prime.size() - 1);
						count = prime.size();
						//検出済みなら配列の中から探す
						if(start >= num) {
							Integer[] tmp = (Integer[]) prime.toArray(new Integer[0]);
							count = Arrays.binarySearch(tmp, num) + 1;
						}
					}
					for(int i = start; i <= num; i+=2) {
						boolean flag = true;
						for(int p : prime) {
							if(i % p == 0) {
								flag = false;
								break;
							} 
						}
						if(flag == true) {
							prime.add(i);
							count++;
						}
					}
				} else count = 0;
				
				System.out.println(count);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}