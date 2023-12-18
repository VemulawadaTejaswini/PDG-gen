import java.io.*;
import java.util.Arrays;
 
 
 
public class Main{
    public static void main(String[] a)  throws IOException
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[10];
        for(int i=0; i<10; i++){
            num[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(num);
	System.out.println(num[9]);
        System.out.println(num[8]);
        System.out.println(num[7]);

        }
}