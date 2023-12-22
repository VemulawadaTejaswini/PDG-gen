import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1=0,num2=0;
        String s = br.readLine();
        String[] str = s.split(" ");
        int[] x = new int[str.length];
        for(int i=0; i<str.length; i++){
            x[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(x);
        for(int i=0; i<str.length-1; i++){
            System.out.print(x[i] +" ");
        }
        System.out.println(x[str.length-1]);
    }
}