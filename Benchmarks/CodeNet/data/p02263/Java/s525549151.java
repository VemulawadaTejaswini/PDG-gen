import java.io.*;
import java.util.*;



public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        str = br.readLine();//34 116 + 20 5 - 5 - 1 * +
        String[] strs = str.split("\\s");
        int[] stack = new int[200];

        int l = 0;
        for(int i=0;i<strs.length;i++){
            if(strs[i].equals("+")){
                l--;
                int x = stack[l+1];
                int y = stack[l];
                stack[l] =  x + y;
                //System.out.println(stack[l]);
            }else if(strs[i].equals("-")){
                l--;
                int x = stack[l+1];
                int y = stack[l];
                stack[l] =  y - x;
                //System.out.println(stack[l]);
            }else if(strs[i].equals("*")){
                l--;
                int x = stack[l+1];
                int y = stack[l];
                stack[l] = x * y;
                //System.out.println(stack[l]);
            }else{
                l++;
                stack[l] = Integer.parseInt(strs[i]);
            }
        }
        
        System.out.println(stack[l]);
        
        br.close();
    }
   
}

