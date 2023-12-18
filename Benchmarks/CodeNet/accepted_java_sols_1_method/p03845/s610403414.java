/*
ID: andy.sc1
LANG: JAVA
TASK: drinks
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
        int[] m = new int[n];
        
        StringTokenizer problems = new StringTokenizer(f.readLine());
        int sum = 0;
        for(int i = 0; i < n; i++) {
            int l = Integer.parseInt(problems.nextToken());
            m[i] = l;
            sum += l;
        }
        
        // System.out.println(Arrays.toString(m));
        
        int a = Integer.parseInt(f.readLine());
        for(int i = 0; i < a; i++) {
            StringTokenizer drink = new StringTokenizer(f.readLine());
            int b = Integer.parseInt(drink.nextToken());
            int c = Integer.parseInt(drink.nextToken());
            System.out.println((sum - m[b - 1] + c));
        }
    }

}
