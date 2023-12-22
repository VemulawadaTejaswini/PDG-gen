import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = reader.readLine();
	    String s[]=str.split(" ");
	    int i1=Integer.parseInt(s[0]);
	    int i2=Integer.parseInt(s[1]);
	    int i3=Integer.parseInt(s[2]);
	    
            System.out.println(i1+i2+i3);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

