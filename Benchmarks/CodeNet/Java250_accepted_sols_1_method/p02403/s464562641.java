import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            //String s = br.readLine();
            String[] str = br.readLine().split(" ");
            int h = Integer.parseInt(str[0]);
            int w = Integer.parseInt(str[1]);
            if(h == 0 || w == 0) break;
            for(int i=0;i<h; i++){
                System.out.print("");
                for(int j=0; j<w-1; j++){
                    System.out.print("#");
                }
                System.out.println("#");
            }
            System.out.print("\n");
            //System.out.println(h+" "+w);
        }
    }
}