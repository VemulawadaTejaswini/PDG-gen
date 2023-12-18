import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.ArrayDeque;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int K = sc.nextInt();
        String S = sc.next();
        int l = S.length();
        
        if(l<=K){
            System.out.println(S);
        }
        else{
            S = S.substring(0, K);
            System.out.println(S + "...");
        }
    }
}