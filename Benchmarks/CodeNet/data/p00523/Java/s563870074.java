import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = BufferedReader(is);
		
		String str = br.readLine();
		int kosuu = Integer.perseInt(str);
		int[] A = new int[kosuu];//配列の宣言の仕方自信なし
		int m = 2000000000, M = 0;
		int kei = 0;
		int kei1 = 0, kei2 = 0, kei3 = 0;//3つの切り分けた領域の合計を表す
		
		for(int i = 0; i < kosuu; i++){
			str = br.readLine();
			A[i] = Integer.perseInt(str);//引数に戻り値のあるメソッドを指定してよいかわからない
		}
		
		for(int i = 1; i < kosuu; i++){
			for(int j = i + 1; j < kosuu + 1; j++){
				for(int k = j + 1; k < kosuu + 2; k++){
					for(int i2 = 0; i2 < i; i2++) kei1 = kei1 + A[i2];
					if(m > kei1) m = kei1;
					for(int j2 = i; j2 < j; j2++) kei2 = kei2 + A[j2];
					if(m > kei2) m = kei2;
					for(int k2 = j; k2 < k; k2++) kei3 = kei3 + A[k2];
					if(m > kei3) m = kei3;
			
					if(m > M) M = m;
				}
			}
		}
		System.out.println(M);
	}
}
