import java.util.*;
import java.io.*;
class Main {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String str[] = br.readLine().split(" ");
        int num = Integer.parseInt(br.readLine());
        //int height = Integer.parseInt(str[1]);
        String str2[] = br.readLine().split(" ");
        int[] arr = new int[str2.length];
        int temp=0;
        for(int i=0;i<str2.length;i++)
        {
            temp = Integer.parseInt(str2[i]);
            arr[temp-1]=i+1;
        }
        for(int i=0;i<str2.length;i++)
            System.out.print(arr[i]+" ");
   }
}