import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.ArrayDeque;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String n = sc.next();
        int l = n.length();
        if(n.charAt(l-1)=='2' || n.charAt(l-1)=='4' || n.charAt(l-1)=='5' || n.charAt(l-1)=='7' || n.charAt(l-1)=='9'){
            System.out.println("hon");
        }
        else if(n.charAt(l-1)=='0' || n.charAt(l-1)=='1' || n.charAt(l-1)=='6' || n.charAt(l-1)=='8'){
            System.out.println("pon");
        }
        else if(n.charAt(l-1)=='3'){
            System.out.println("bon");
        }
    }
}