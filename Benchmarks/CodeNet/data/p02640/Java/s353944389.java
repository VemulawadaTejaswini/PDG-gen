import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.io.*;

public class Main {
    static boolean solve(int heads, int legs){
        for(int crane=0; crane<=heads; crane++){
            int turtle = heads-crane;
            if(crane*2+turtle*4==legs) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int heads = sc.nextInt();
        int legs = sc.nextInt();
        System.out.println(solve(heads, legs) ? "Yes" : "No");
        
    }
}