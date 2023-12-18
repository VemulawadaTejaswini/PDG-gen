import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String base;
		String comparison;
		
		try {
			base = br.readLine();
			comparison = br.readLine();
			
			Inversions(base, comparison, br);
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
	
	public static void output(int[] array, int num){
	   //出力
	   StringBuilder sb = new StringBuilder("");
	   for (int i = 0; i < num; i++) {
		  sb.append( array[i] ).append("\n");
	   }
		System.out.print(sb);
	}

	public static void Inversions(String base, String comparison,  BufferedReader br){
		int length = base.length() - comparison.length();
		String 	container;
		int ans_num = 0;
		int[] ans = new int[1000000];
		
		for(int i = 0; i <= length ; i ++ ) {
			container = base.substring( i, i + comparison.length() );
			if( container.equals(comparison) ) {
				ans[ans_num] = i;
				ans_num ++;
			}
		}
		
		output( ans, ans_num );
	}
}
