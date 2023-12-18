import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String base = null;
		String comparison = null;
		
		try {
			base = br.readLine();
			comparison = br.readLine();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		Inversions(base, comparison, br);
		
	}

	public static void Inversions(String base, String comparison,  BufferedReader br){ 
		int length = base.length() - comparison.length();
		String 	container;
		
		for(int i = 0; i <= length ; i ++ ) {
			container = base.substring( i, i + comparison.length() );
			if( container.equals(comparison) ) {
				System.out.println(i);
			}
		}
		
	}
}

/* 実行時間計測用

		long start = System.currentTimeMillis();
		long end = System.currentTimeMillis();
		System.out.println((end - start)  + "ms:計測時間");
*/
