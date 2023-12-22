import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.channels.NonWritableChannelException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // create a to z map
        Map<Character, Integer> alphamap = new HashMap<Character, Integer>();
        for(int i='a'; i<='z'; i++) {
            alphamap.put((char) i, 0);
        }
        
        String line = "";
        while ( (line = br.readLine()) != null ) {
            for (int i=0; i<line.length(); i++) {
                char c = line.charAt(i);
                c = Character.toLowerCase(c);
                if (alphamap.containsKey(c)) {
                    alphamap.replace(c, alphamap.get(c) + 1);
                }
            }
        }


        

        
        for( Character c : alphamap.keySet()) {
            System.out.println(c + " : " + alphamap.get(c));
        }
        
        
    }


}
