import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        String[] input1 = br.readLine().split(" ");
        int n = Integer.parseInt(input1[0]);
        double m = Double.parseDouble(input1[1]);
        
        String[] input2 = br.readLine().split(" ");
        Integer[] votes = new Integer[n];
        
        int voteCount = 0;
        
        for(int i = 0; i < n; i++){
            votes[i] = Integer.valueOf(input2[i]);
            voteCount += votes[i];
        }
        
        Arrays.sort(votes, Collections.reverseOrder());
        
        if(votes[(int)(m - 1)] >= voteCount * (1 / (4 * m))){
            out.println("Yes");
        }else{
            out.println("No");
        }
        
        out.close();
        
    }
}