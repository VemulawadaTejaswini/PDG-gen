import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1=0,num2=0;
        String s = br.readLine();
        String[] str = s.split(" ");
        int x = Integer.parseInt(str[0]);
        int y = Integer.parseInt(str[1]);
        int z = Integer.parseInt(str[2]);
        //System.out.println(x +"<"+ y +"<"+ z);
        
        if(x < y && y < z){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}