import java.util.*;
import java.io.*;
class Main {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split(" ");
        int num = Integer.parseInt(str[0]);
        int height = Integer.parseInt(str[1]);
        String str2[] = br.readLine().split(" ");
        long count=0;
        for(int i=0;i<str2.length;i++)
        {
            if(Integer.parseInt(str2[i])>=height)
                count++;
        }
        System.out.println(count);
   }
}