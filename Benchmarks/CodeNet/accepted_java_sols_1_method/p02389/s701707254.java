import java.io.*;
import java.util.*;

class Main
{
    public static void main (String args[]) throws IOException         //?????????
    {
        InputStreamReader is = new InputStreamReader(System.in);       //?????????
        BufferedReader br = new BufferedReader(is);                    //?????????
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int area = a * b;
        int length = 2*(a+b);
        
        System.out.println(area+" "+length);
    }
}
    