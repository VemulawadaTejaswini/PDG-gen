import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int red = 0;
        int white = 0;
        for (int i=0;i<n;i++){
            if (s.charAt(i)=='R')red++;
            else white++;
        }
        int proR = 0;
        int proW = 0;
        for (int i=0;i<red;i++){
            if (s.charAt(i)=='W')proW++;
        }
        for (int i=red;i<n;i++){
            if (s.charAt(i)=='R')proR++;
        }
        System.out.println(Math.min(proR,proW));
    }
}
