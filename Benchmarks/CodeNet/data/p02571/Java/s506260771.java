import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.math.*;
import java.util.*;
class Main{

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        String t = br.readLine();
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < S.length() - t.length() + 1; i++){

            String s = S.substring(i, i + t.length());

            int count = 0;
            for(int j = 0; j < t.length(); j++){
                if(t.charAt(j) != s.charAt(j)){
                    count++;
                }
                if(count >= min){
                    break;
                }
                
            }
            min = Math.min(min, count);

        }
        System.out.print(min);
    }  

}