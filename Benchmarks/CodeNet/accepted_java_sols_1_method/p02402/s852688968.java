import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException
	{
        int n;
		int a; 
		int min;
		int max;
		int i;
        long sum=0;
         
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
         
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
         
        String[] strAry = br.readLine().split(" ");
         
        for (i=0;i<n;i++) {
            a = Integer.parseInt(strAry[i]);
            if (a<min) min = a;
            if (a>max) max = a;
            sum += a;
        }
         
        System.out.println(min + " " + max + " " + sum);
    }
}