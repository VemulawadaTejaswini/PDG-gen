import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        Set<Integer> p = new HashSet<>();
        for(int n=0; n<N; n++) p.add(sc.nextInt());
        
        for(int d=0; d<100000; d++){
            if(!p.contains(X-d)){
                System.out.println(X-d);
                break;
            }
            if(!p.contains(X+d)){
                System.out.println(X+d);
                break;
            }
        }
    }
}