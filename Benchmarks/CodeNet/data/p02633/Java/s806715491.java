import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
 
public class Main {    
    public static void main(String[] args)throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String sn = input.readLine();
        int x = Integer.parseInt(sn);

        int y = lcm(x,360);
        System.out.println(y/x);
    }
    
    static int lcm (int a, int b) {
        int temp;
        long c = a;
        c *= b;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return (int)(c/b);
    }
        
}