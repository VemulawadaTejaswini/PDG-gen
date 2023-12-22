import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String[] args) throws IOException{
    int sub = 0;
    int i = 1;
    String s;
    int a = 0;
    int b = 0;
        while(i>0){
            BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
            s = x.readLine();
            StringTokenizer st = new StringTokenizer(s," ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            if(a >= -1000 && a <= 1000 )
                i = -1;
            else if(b >= -1000 && b <= 1000)
                i = -1;
            else
                i = 1;
         }
        sub = a-b;
            if(sub<0)
                System.out.println("a < b");
            else if(sub>0)
                System.out.println("a > b");
            else if(sub==0)
                System.out.println("a == b");
    }
}