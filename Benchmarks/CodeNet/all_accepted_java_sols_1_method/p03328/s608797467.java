import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int aBuried = sc.nextInt();
        int bBuried = sc.nextInt();
        
        int difference = bBuried - aBuried;
        int realB = difference * (difference + 1) / 2;
        int piledSnow = realB - bBuried;
        
        System.out.println(piledSnow);
    }
}
