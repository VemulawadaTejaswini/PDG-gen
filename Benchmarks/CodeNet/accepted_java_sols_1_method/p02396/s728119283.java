import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            int count = 0;
            
            while(line.equals("0") == false){
            	System.out.println("Case "+ ++count + ": " +line);
            	//strList.add(line);
                line = br.readLine();
            }
            /*
            for (String str : strList) {
            	System.out.println("Case "+ (strList.indexOf(str) + 1) + ": " +str);
			}
            */
            br.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}