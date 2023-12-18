import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<String> strList = new ArrayList<String>();
            String line = br.readLine();
            
            while(line.equals("0") == false){
            	strList.add(line);
                line = br.readLine();
            }
            for (String str : strList) {
            	System.out.println("Case "+ strList.indexOf(str) + ": " +str);
			}
            br.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}