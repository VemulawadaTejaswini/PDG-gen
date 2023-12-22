import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) throws IOException {
	    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String str = reader.readLine();
            StringBuffer sb = new StringBuffer(str);
            System.out.println(sb.reverse());
    }
}