import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String string;
		int n;
		
		while((string = reader.readLine()) != null){
			n = Integer.valueOf(string);
			int array[][] = new int[n][3];
			boolean resul[][] = new boolean[n][3];
			
			for(int i = 0; i < n; i++){
				string = reader.readLine();
				array[i][0] = Integer.valueOf((string.split(" ")[0]));
				array[i][1] = Integer.valueOf((string.split(" ")[1]));
				array[i][2] = Integer.valueOf((string.split(" ")[2]));
			}
			
			for(int i = 0; i < 3; i++){
				for(int j = 0; j < n; j++){
					for(int k = j + 1; k < n; k++){
						if(array[j][i] == array[k][i]){
							resul[j][i] = true;
							resul[k][i] = true;
						}
					}
				}
			}
			
			for(int i = 0; i < n; i++){
				for(int j = 0; j < 3; j++)
					if(resul[i][j]) array[i][j] = 0;
				
				System.out.println(array[i][0] + array[i][1] + array[i][2]);
			}
		}
	}
}