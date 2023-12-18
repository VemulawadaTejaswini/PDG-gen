import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[]args) {
        try {
        
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

      HashSet<String> lottery = new HashSet<String>();
      for(int i = 0;i<n;i++) {
          String words = br.readLine();
          lottery.add(words);
      }
System.out.println(lottery.size());

        }catch(Exception e) {
        }
    }

    
}