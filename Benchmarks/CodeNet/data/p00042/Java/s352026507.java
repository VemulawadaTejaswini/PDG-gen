import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main
{
	static int W = 0;
	static int N = 0;
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		int Case  = 1;
		do{
			if((W = Integer.parseInt(s)) == 0) break;
			N = Integer.parseInt(br.readLine());
			int[][] data = new int[N][2];
			for (int i = 0; i < N; i++) {
				String d = br.readLine();
				data[i][0] = Integer.parseInt(d.split(",")[0]);
				data[i][1] = Integer.parseInt(d.split(",")[1]);
			}
			int[] answer = dfs(data, 0, 0, 0); //answer [0]:price [1]:weight
			System.out.println("Case " + Case + ":");
			System.out.println(answer[0]);
			System.out.println(answer[1]);
			Case++;
		} while((s=br.readLine())!=null);
	}
	
	private static int[] dfs(int[][] data, int i, int price, int weight)
	{
		if( i == N ) {
			int temp[] = new int[2];
			temp[0] = price; temp[1] = weight;		
			return temp;
		}
		
		int[] temp1 = new int[2];
		int[] temp2 = dfs(data, i+1, price, weight);
		
		if( (weight+= data[i][1]) <= W) temp1 = dfs(data, i+1, price+=data[i][0], weight);
		if(temp1[0] > temp2[0]) return temp1;
		return temp2;
	}
}