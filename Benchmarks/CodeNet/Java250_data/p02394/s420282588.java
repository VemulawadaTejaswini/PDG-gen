import java.util.*;
import java.io.*;
 
class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] str = br.readLine().split(" ");
        int w = Integer.parseInt(str[0]);
        int h = Integer.parseInt(str[1]);
        int x = Integer.parseInt(str[2]);
        int y = Integer.parseInt(str[3]);
        int r = Integer.parseInt(str[4]);
        //System.out.println(w+" "+h+" "+x+" "+y+" "+r);
        if((x>=-100 && x<=100 && y>=-100 && y<=100) && (w>0 && h>0 && r>0 && w<=100 && h<=100 && r<=100)){
            if((x-r<0 || x+r>w) || (y-r<0 || y+r>h)){
                System.out.println("No");
            }else if((x-r>=0 && x+r<=w) || (y-r>=0 && y+r<=h)){
                System.out.println("Yes");
            }
        }
    }
}