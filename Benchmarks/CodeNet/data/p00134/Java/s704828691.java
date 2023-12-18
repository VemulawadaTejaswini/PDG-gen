import java.io.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while((line = in.readLine()) != null){
			int n = Integer.parseInt(line);
			int sum = 0;
			for(int i=0; i<n; i++){
				line = in.readLine();
				sum += Integer.parseInt(line);
			}
			sum /= n;

			System.out.println(sum);
		}
	}
}