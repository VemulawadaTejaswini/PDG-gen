import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
	public static void main(String[] args) {
		int MAX = 100000;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		int[] prime = new int[MAX];
		int count = 0;
		int insertPoint = 0;
		
		try {
			while ((line = br.readLine()) != null) {
				line = line.trim();
				int num = Integer.parseInt(line);
				if (num < 0 || num > 999999)System.exit(-1);
				if(num >= 2) {
					int start = 3;
					//１つの素数は１回しか探さないようにする
					if(insertPoint == 0) {
						//初回
						prime[insertPoint++] = 2;
						count = insertPoint;
					} else {
						//２回目以降
						start = prime[insertPoint - 1];
						count = insertPoint;
						//検出済みなら配列の中から探す
						if(start >= num) {
							count = Math.abs(Arrays.binarySearch(prime,0, insertPoint - 1, num) + 1);
						}
					}
					for(int i = start; i <= num; i+=2) {
						boolean flag = true;
						for(int p = 1; p < insertPoint; p++ ) {
							if(i % prime[p] == 0) {
								flag = false;
								break;
							} 
						}
						if(flag == true) {
							prime[insertPoint++] = i;
							count = insertPoint;
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