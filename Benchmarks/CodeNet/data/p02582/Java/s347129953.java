import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
       
        if (s.equals("RRR")) System.out.println(3);
        if (s.equals("RRS") || s.equals("SRR")) System.out.println(2);
        if (s.equals("RSR") || s.equals("RSS") || s.equals("SSR")) System.out.println(1);
        if (s.equals("SSS")) System.out.println(0);
         
    }
}