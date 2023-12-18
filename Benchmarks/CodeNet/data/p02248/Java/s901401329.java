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
	public static void Inversions(String base, String comparison,  BufferedReader br){ 
		StringBuilder sb = new StringBuilder();
		int length = base.length() - comparison.length();
		String 	container;
		int ans_num = 0;
		int[] ans = new int[100];
		
		for(int i = 0; i <= length ; i ++ ) {
			container = base.substring( i, i + comparison.length() );
			if( container.equals(comparison) ) {
				ans[ans_num] = i;
				ans_num ++;
			}
		}
		for(int i = 0; i <ans_num; i++){
            //System.out.println(start + i);
            sb.append(ans[i] + "\n");
        }
        System.out.print(sb);
	}
}
