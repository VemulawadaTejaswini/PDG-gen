/*
ID: andy.sc1
LANG: JAVA
TASK: lining
*/

// Imports
import java.util.*;
import java.io.*;

public class Main {

    /**
     * @param args the command line arguments
     * @throws IOException, FileNotFoundException 
     */
    public static void main(String[] args) throws IOException, FileNotFoundException {
        
        // TODO UNCOMMENT WHEN ALGORITHM CORRECT
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        
        // TODO code application logic here
        int n = Integer.parseInt(f.readLine());
        int[] counts = new int[n];
        
        StringTokenizer numbers = new StringTokenizer(f.readLine());
        for(int i = 0; i < n; i++) {
            counts[i] = Integer.parseInt(numbers.nextToken());
        }
        
        Arrays.sort(counts);
        
        int current = (n%2)^1;
        int numleft = 2;
        if(current == 0) {
            numleft--;
        }
        
        boolean consistent = true;
        for(int i = 0; i < n; i++) {
            if(counts[i] == current) {
                numleft--;
                if(numleft == 0) {
                    current += 2;
                    numleft = 2;
                }
            }
            else {
                consistent = false;
                break;
            }
        }
        
        if(consistent) {
            int pow = n/2;
            long p = 1;
            for(int i = 0; i < pow; i++) {
                p *= 2;
                p = p % 1000000007;
            }
            System.out.println(p);
        }
        else {
            System.out.println(0);
        }
    }

}
