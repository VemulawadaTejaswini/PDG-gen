import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main
{
	public static void main(String[] args){
		String line = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ans;
		try{
			while(true){
				line = br.readLine();
				String[] array;
				array = line.split(" ");
				System.out.println(Math.round(Math.log10(Double.parseDouble(array[0]) + Double.parseDouble(array[1])) + 1));
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}