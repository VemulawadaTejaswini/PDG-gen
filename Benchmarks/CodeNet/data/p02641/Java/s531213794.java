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
        
        int X = sc.nextInt();
        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<N; i++) {
            list.add(sc.nextInt());
        }
        if(N==0) {
            System.out.println(X);
            return;
        }
        for(int i=1; i<=100; i++) {
            if(!list.contains(X-i)) {
                System.out.println(X - i);
                return;
            }
            else if(!list.contains(X+i)) {
                System.out.println(X + i);
                return;
            }
        }
    } 
}