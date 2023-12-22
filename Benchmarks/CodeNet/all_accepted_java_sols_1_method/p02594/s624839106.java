import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=1;
//        String T=br.readLine();
//        if(T!=null) t=Integer.parseInt(T);
        while(t-- > 0) {
            int x = Integer.parseInt(br.readLine());
            if(x >= 30) System.out.print("Yes\n");
            else System.out.print("No\n");
        }
    }
}