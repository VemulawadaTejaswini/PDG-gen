import java.io.*;
import java.util.*;



public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
                    
        str = br.readLine();
        String[] line = str.split("\\s");
        int x = Integer.parseInt(line[0]);
        int y = Integer.parseInt(line[1]);
     
        int temp = 0;
        if(x > y){
            temp = y;
            y = x;
            x = temp;
        }

        temp = run(x,y);

        System.out.println(temp);
       
        br.close();
    }

    public static int run(int x,int y){
        if(x == 0){
            return y;
        }else{
            int m = y % x;
            return run(m,x);
        }
    }
}

