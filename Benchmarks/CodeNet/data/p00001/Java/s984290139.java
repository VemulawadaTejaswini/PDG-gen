import java.io.*;
import java.util.Arrays;
public class ProgteamA {
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter length");
        int len = Integer.parseInt(br.readLine());
        int A[] = new int[len];
        
        for(int i =0; i< len; i++)
            A[i] = Integer.parseInt(br.readLine());
        
        Arrays.sort(A);
        
        System.out.println(A[len-1]);
        System.out.println(A[len-2]);
        System.out.println(A[len-3]);
        
        
    }
}