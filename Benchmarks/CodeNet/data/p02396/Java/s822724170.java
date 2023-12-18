import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder b = new StringBuilder();


		
		int i,s;
		i = 0;

		while(true){
			i++;
			s = Integer.parseInt(br.readLine());
			if(s == 0){break;}
			
			//str = str+ "Case " + Integer.toString(i) + ": " + str + "\n";
			
			b.append("Case ");
			b.append(Integer.toString(i));
			b.append(": ");
			b.append(Integer.toString(s));
			b.append("\n");
			
			
			
		}

		System.out.println(new String(b));

	}
}