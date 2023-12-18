import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {

		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int N = Integer.parseInt(br.readLine());
            for(int i = 0; i < N; i++) {
        	     String[] line = br.readLine().split(" ");
        	     for(int j = 0; j < line.length; j++) { 
        		    if (line[j].equals("Hoshino")) {
        			line[j] = "Hoshina";
        		    }
        	     }
        	String result = "";
        	for(int k = 0; k < line.length; k++) { 
        		result = result + line[k] + " ";
        	}
        	System.out.print(result.trim());
            }
	}
}