import java.io.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		String str = br.readLine();
		int n = Integer.parseInt(str);
		int m = n;
		int[] amida = new int[n];
		for(int i = 0; i < n; i++)
			amida[i] = i+1;
		str = br.readLine();
		n = Integer.parseInt(str);
		int[][] yoko = new int[n][2];
		
		for(int i = 0; i < n; i++){
			str = br.readLine();
			String str1 = str.substring(0, str.indexOf(","));
			str = str.substring(str.indexOf(",")+1);
			yoko[i][0] = Integer.parseInt(str1);
			yoko[i][1] = Integer.parseInt(str);
		}
		for(int i = 1; i < n+1; i++){
			int c1=0, c2=0;

			for(int j = 0; j < m; j++){
				if(amida[j] == yoko[n-i][0] )c1 = j;
				if(amida[j] == yoko[n-i][1] )c2 = j;
			}
			int tmp = amida[c1];
			amida[c1] = amida[c2];
			amida[c2] = tmp;
		}
		for(int k = 0; k < m; k++){
			System.out.println(amida[k]);
		}
				
	}

}