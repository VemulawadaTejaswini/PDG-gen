import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        if(a<=100){
            int[] num = new int[a];
            String[] str = br.readLine().split(" ");
            for(int i=0; a>0; i++){
                num[i] = Integer.parseInt(str[--a]);
                System.out.print(num[i]);
                if(a != 0){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}