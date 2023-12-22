import java.util.*;
import java.io.*;
class Main {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int que = Integer.parseInt(br.readLine());
        int odds = (que/2) + (que%2);
        double dd = ((double)odds/(double)que);
        System.out.println(dd);
   }
}
