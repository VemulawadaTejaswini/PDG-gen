import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		Main app = new Main();
		String string;
		int map[][] = new int[50][50], max = 0;
		while((string = reader.readLine()) != null){
			int array[] = app.splitter(string);
			max = max > array.length ? max : array.length;
			for(int i = 0; i < array.length; i++)
				map[max - i - 1][max - array.length + i] = array[i];
		}
		int res[][] = new int[max + 1][max + 1];
		res[0][0] = map[0][0];
		for(int i = 0; i < max; i++){
			for(int j = 0; j < max; j++){
				if(res[i][j] > 0){
					res[i][j + 1] = Math.max(res[i][j + 1], res[i][j] + map[i][j + 1]);
					res[i + 1][j] = Math.max(res[i + 1][j], res[i][j] + map[i + 1][j]);
				}else{
					res[i][j + 1] = res[i][j] + map[i][j + 1];
					res[i + 1][j] = res[i][j] + map[i + 1][j];
				}
			}
		}
		System.out.println(res[max - 1][max - 1]);
		reader.close();
	}
	
	public int[] splitter(String string){
		String str[] = string.split(",");
		int array[] = new int[str.length];
		for(int i = 0; i < str.length; i++)
			array[i] = Integer.valueOf(str[i]);
		return array;
	}
	
}