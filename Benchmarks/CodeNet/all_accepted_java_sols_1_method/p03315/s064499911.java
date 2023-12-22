import java.util.*;
import java.io.*;

public class Main{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //test cases
        String s = in.next();
        int n = s.length();
       
        int count=0;
        for(int i=0 ; i<n ; i++){
            if(s.charAt(i)=='+') count++;
            else count--;
        }
        System.out.println(count);
    }
}