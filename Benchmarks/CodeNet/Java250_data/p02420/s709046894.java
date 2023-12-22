import java.util.Scanner;
import java.io.*;

class Main {
    public static void main(String[] args)throws IOException{ 
    	InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
    	   	                                                 
    	while(true){
        String trump = reader.readLine();
            if(trump.equals("-")){
            break;
            }

            int m = Integer.parseInt(reader.readLine());

            for(int H = 0; H < m; H++){
                int h = Integer.parseInt(reader.readLine());
                String left = trump.substring(0, h);
                String right = trump.substring(h, trump.length());
                trump = right + left;
            }
            System.out.println(trump);
        }
    }
}