import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	static char flag[] = new char[]{'m', 'c', 'x', 'i'};
	static int num[] = new int[]{1000, 100, 10, 1};
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		Main app = new Main();
		
		String str[] = reader.readLine().split(" ");
		int n = Integer.valueOf(str[0]);
		int m = Integer.valueOf(str[1]);
		int a = Integer.valueOf(str[2]) - 1;
		int mayor[] = new int[n];
		boolean node[][][] = new boolean[n][n][1000];
		for(int i = 0; i < m; i++){
			str = reader.readLine().split(" ");
			node[Integer.valueOf(str[1]) - 1]
				[Integer.valueOf(str[2]) - 1]
				[Integer.valueOf(str[0])] = true;
		}
		for(int i = 999; i >= 0; i--){
			for(int j = 0; j < n; j++){
				for(int k = 0; k < n; k++){
					if(node[j][k][i]){
						if(j == a)
							a = k;
						else if(k == a)
							a = j;
					}
				}
			}
		}
		System.out.println(a + 1);
		reader.close();
	}
}