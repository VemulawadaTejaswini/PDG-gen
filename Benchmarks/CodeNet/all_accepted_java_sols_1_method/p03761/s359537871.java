import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int a = Character.getNumericValue('a');

		int[][] map = new int[n][26];
			for(int i = 0; i < n; i++){
				String input = br.readLine();
				for(int j =0; j<input.length(); j++){
					int idx = Character.getNumericValue(input.charAt(j)) - a;
					map[i][idx] += 1;
			}
		}
		int[] alp = new int[26];
		for(int i =0; i<26; i++){
			alp[i] =(int)1e9;
		}

		for(int i=0; i<n; i++){
			for(int j=0; j<26; j++){
				if(map[i][j] == 0){
					alp[j] = 0;
				}else{
					alp[j] = Math.min(map[i][j],alp[j]);
				}
			}
		}

		for(int i=0; i<26;i++){
			char c = (char)('a' + i);
			int count = alp[i];
			for(int j=0; j<count; j++){
				System.out.print(c);
			}
		}
		
	}
}