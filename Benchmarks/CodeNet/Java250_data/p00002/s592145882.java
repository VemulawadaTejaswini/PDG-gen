import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] a)throws IOException{
    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
 		String str = null;
 		String[] strList = new String[2];

 		while((str = in.readLine()) != null){                    
            strList = str.split(" ");

            int sum = Integer.parseInt(strList[0])+Integer.parseInt(strList[1]);

            System.out.println(String.valueOf(sum).length());
	    }
    }
}