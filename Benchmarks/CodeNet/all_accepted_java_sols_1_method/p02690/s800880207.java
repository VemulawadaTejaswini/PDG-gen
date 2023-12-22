import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        boolean bool = true;
        for (long a=-118;a<=119&&bool;a++){
            for (long b=-119;b<=118&&bool;b++){
                if (a*a*a*a*a-b*b*b*b*b==x){
                    System.out.println(a+" "+b);
                    bool=false;
                }
            }
        }
    }
}
