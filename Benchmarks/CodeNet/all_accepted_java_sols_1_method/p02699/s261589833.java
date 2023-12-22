import java.util.*;
import java.util.TreeMap;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
 
class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
 
        int S = sc.nextInt();
        int W = sc.nextInt();
 
        if(S>W){
            System.out.println("safe");
        }
        else{
            System.out.println("unsafe");
        }
    }
}