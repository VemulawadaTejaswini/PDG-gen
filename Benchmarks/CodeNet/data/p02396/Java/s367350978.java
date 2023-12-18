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
            
            while(line != null){
            	strList.add(line);
                line = br.readLine();
                System.out.println("readLine()");
            }
            for (String str : strList) {
            	System.out.println("Case "+ strList.indexOf(str) + ": " +str);
			}
            br.close();
            System.out.println("close");
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}