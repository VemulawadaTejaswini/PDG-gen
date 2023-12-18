import java.io.*;
import java.util.*;

public class Main{
    public static void main(String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long array[] = new long[n];
        String temp[] = br.readLine().split(" ");
        long ans = 1;
        long maxValue =1000000000000000000l;
        for(int i=0;i<n;i++){ 
            array[i] = Long.parseLong(temp[i]);
            if(array[i]==0) {System.out.println(0); return;}
        }

        for(int i=0;i<n;i++){ 
        
            if(array[i]<=(maxValue/ans)) {
                ans = ans*array[i];
            }
            else {
                System.out.println(-1);
                return;
            }
        }


        System.out.println(ans);
       

    }
}