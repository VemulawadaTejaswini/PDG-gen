import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws Exception {
        String[] s;
        int[] a=new int[3];
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        s=br.readLine().split(" ");
        a[0]=Integer.parseInt(s[0]);
        a[1]=Integer.parseInt(s[1]);
        a[2]=Integer.parseInt(s[2]); 
        Arrays.sort(a);
        System.out.println(a[0]+" "+a[1]+" "+a[2]);
    }
}
//by TTTMongolia 10/05/2012