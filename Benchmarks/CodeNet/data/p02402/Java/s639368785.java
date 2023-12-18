import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] argst)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        
            int al = Integer.parseInt(str);
            //System.out.println(al);
                         
            str = br.readLine();
            String[] strs = str.split("\\s");
      
            int maxnum = -100000000;
            int minnum = 100000000;
            int sumnum = 0;
                          
            for(int i =0;i<al;i++){
                int temp = Integer.parseInt(strs[i]);
                //System.out.println(temp);
                if(maxnum < temp){
                maxnum = temp;
                }
                if(minnum > temp){
                minnum = temp;
                }
                sumnum += temp;
                }
      
                String ans = minnum + " " + maxnum + " " + sumnum;
      
                System.out.println(ans);
    }
}
    }
}