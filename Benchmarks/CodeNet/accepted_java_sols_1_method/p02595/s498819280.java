import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[])throws Exception{
    Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        int count = 0;
        while(N-->0){
            long X = sc.nextLong();
            long Y = sc.nextLong();
            double dis = Math.sqrt(((long)X*X)+ ((long)Y*Y));
            if(dis<=D) count++;
        }
        System.out.println(count);
    }
}
