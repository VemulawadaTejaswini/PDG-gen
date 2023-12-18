import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader r =
         new BufferedReader(new InputStreamReader(System.in));       
        String line = r.readLine();   
        
        int cnt=1;
        int buf[]= {0,0};
        while(line!=null){
            String st[] = line.split(" ",0);
            buf[0] = Integer.parseInt(st[0]);
            buf[1]= Integer.parseInt(st[1]);
            if (buf[0] == 0 && buf[1]==0) break;
            Arrays.sort(buf);
            System.out.println(buf[0]+" "+buf[1]);
            line = r.readLine();
        }        
    }
}