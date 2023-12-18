import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.ArrayDeque;
import java.awt.Point;
 
class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        long N = (long)sc.nextLong();
        String[] al = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String ans = "";
        ArrayList<Integer> list = new ArrayList<>();

        while(true){
            if(N < 26){
                list.add((int)(N % 26));
                break;
            }
            else{
                list.add((int)(N % 26));
                N /= 26;
            }
        }

        for(int i=list.size()-1; i>=0; i--){
            ans += al[list.get(i) - 1];
        }
        System.out.println(ans);
    } 
}