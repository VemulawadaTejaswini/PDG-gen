import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        switch(str){
            case "Sunny" :
                System.out.println("Cloudy");
                break;
            case "Cloudy" :
                System.out.println("Rainy");
                break;
            case "Rainy" :
                System.out.println("Sunny");
                break;
        }

    }
}
