import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int deg=0;
        int d_deg=0;
        double x=0;
        double y=0;
        int length=0;
        while(true){
            deg+=d_deg;
            StringTokenizer st=new StringTokenizer(br.readLine(),",");
            length=Integer.parseInt(st.nextToken());
            d_deg=Integer.parseInt(st.nextToken());
            if(d_deg==0&&length==0) break;
            x+=length*Math.cos(Math.toRadians(deg));
            y+=length*Math.sin(Math.toRadians(deg));
            
        }System.out.println((int)y);
        System.out.println((int)x);
    }
}