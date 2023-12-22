import java.util.*;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int resultA=0;
        int resultB=0;

        for (int i =0; i<n.length(); i++) {
           if (i%2==0 && n.charAt(i) == '0') {
               resultA++;
           } 
           if (i%2==1 && n.charAt(i) == '1') {
               resultA++;
           }
        }

        for (int i =0; i<n.length(); i++) {
           if (i%2==0 && n.charAt(i) == '1') {
               resultB++;
           } 
           if (i%2==1 && n.charAt(i) == '0') {
               resultB++;
           }
        }
        System.out.println(resultA > resultB?resultB:resultA);
        sc.close();
    }
}