import java.util.*;
import java.io.*;


class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int S = in.nextInt();
        int s = S%60;S/=60;
        int m = S%60;S/=60;
        int h = S;
        System.out.println(""+h+":"+m+":"+s);
    }
    
}
