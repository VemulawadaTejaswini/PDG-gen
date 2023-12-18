import java.util.*;

public class Main {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.indexOf("RRR") != -1){
          System.out.println(3);
        } else if (s.indexOf("RR") != -1){
          System.out.println(2);
        } else if (s.indexOf("R") != -1){
          System.out.println(1);
        } else {
          System.out.println(0);
        }
    }
}