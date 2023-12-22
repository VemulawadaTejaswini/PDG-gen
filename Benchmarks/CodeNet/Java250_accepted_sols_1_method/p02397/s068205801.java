import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            String[] strArray = new String[2];
            
            while(line.equals("0 0") == false){
            	strArray = line.split("\\s");
            	if(Integer.parseInt(strArray[0]) > Integer.parseInt(strArray[1])){
            		System.out.println(strArray[1] + " " + strArray[0]);
            	}else{
            		System.out.println(strArray[0] + " " + strArray[1]);
            	}
            	
                line = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}