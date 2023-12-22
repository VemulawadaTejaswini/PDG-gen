import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        
        int S = in.nextInt();
        int W = in.nextInt();
     
        System.out.println(W >= S ? "unsafe": "safe");
    }
    

        
}
