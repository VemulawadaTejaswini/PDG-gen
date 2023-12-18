import java.io.*;

public class Main{
	public static void main(String argv[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int weeks = Integer.parseInt(line);
		float debt = 100000;
		for(int i=0; i<weeks; i++){
			debt *= 1.05f;
			if((debt % 1000) > 0.0){
				debt = debt+1000-debt%1000;
			}
		}
		System.out.print(Integer.toString((int)debt)+"\n");
	}
}