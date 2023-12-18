import java.io.*;
import java.util.*;

public class Main{
    public static void main(String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int test = Integer.parseInt(br.readLine());

        // while(test-->0) {
            
            String temp[] = br.readLine().split(" ");
            int a=  Integer.parseInt(temp[0]);
            int b = Integer.parseInt(temp[1]);
            System.out.println(a*b);

        // }

    }
}
