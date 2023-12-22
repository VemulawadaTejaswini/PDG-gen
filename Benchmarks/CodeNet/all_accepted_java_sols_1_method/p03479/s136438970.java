import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        long a=in.nextLong();
        long count=0;
        long b=in.nextLong();
        while(a<=b){
            count++;
            a=a*2;
        }
        System.out.println(count);
    }
}