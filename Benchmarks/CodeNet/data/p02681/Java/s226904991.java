import java.util.*;


import java.io.*;

public class Main {
    
    public static String solve(String s1 , String s2){
        if(Math.abs(s1.length() - s2.length()) > 1 || Math.abs(s1.length() - s2.length())== 0)
            return "No";
        return (s2.indexOf(s1) == 0) ? "Yes" : "No";
    }
    

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solve(br.readLine().trim(),br.readLine().trim()));
    }
}