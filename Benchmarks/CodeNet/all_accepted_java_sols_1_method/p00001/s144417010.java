import java.io.*;
import java.util.Arrays;
public class Main{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        int A[] = {1819, 2003, 876, 2840, 1723, 1673, 3776, 2848, 1592, 922};
        int len = A.length;
        for(int i =0; i<len ; i++)
            A[i] = Integer.parseInt(br.readLine());
        
        Arrays.sort(A);
        
        System.out.println(A[len-1]);
        System.out.println(A[len-2]);
        System.out.println(A[len-3]);
        
        
    }
}