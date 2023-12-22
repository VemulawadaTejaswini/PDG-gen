import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
                    
        str = br.readLine();
        String[] nums = str.split("\\s");

        double a = (Double.parseDouble(nums[2]) - Double.parseDouble(nums[0]));
        double b = (Double.parseDouble(nums[3]) - Double.parseDouble(nums[1]));

        double ans = Math.sqrt((Math.pow(a,2) + Math.pow(b,2)));
        
        System.out.println(ans);
        
        br.close();
        
    }

}

