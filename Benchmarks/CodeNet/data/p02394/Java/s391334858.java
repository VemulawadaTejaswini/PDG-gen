import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String[] args) throws IOException{
    int i = 1;
    String s;
    int W,H,x,y,r;
    W = 0;
    H = 0;
    x = 0;
    y = 0;
    r = 0;
        while(i>0){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            s = br.readLine();
            StringTokenizer st = new StringTokenizer(s," ");
            W = Integer.parseInt(st.nextToken());
            H = Integer.parseInt(st.nextToken());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            r = Integer.parseInt(st.nextToken());
            if(W >= -100 && W <= 100 )
                i = -1;
            else if(H >= -100 && H <= 100)
                i = -1;
            else if(x > 0 && x <= 100)
                i = -1;
            else if(y > 0 && y <= 100)
                i = -1;
            else if(r > 0 && r <= 100)
                i = -1;
            else
                i = 1;
         }
            if(x-r>=0 && x+r<=W){
            if(y-r>=0 && y+r<=H)
                System.out.println("Yes");
            else
                System.out.println("No");
            }
            else
                System.out.println("No");
    }
}