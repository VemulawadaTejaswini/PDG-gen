import java.util.*;
import java.io.*;

public class Main{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = s.length();

        String temp = "";
        int min = 1000;
        int num =0;
        for(int i=0 ; i<n-2; i++){
            temp = s.substring(i , i+3);
            // System.out.println(temp);
            num = Integer.parseInt(temp);
            num = Math.abs(753-num);
            min = (min<num) ? min : num;
        }
        System.out.println(min);

    }
}