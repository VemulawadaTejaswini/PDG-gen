import java.util.*;
 
public class Main {
    private static final Scanner scn = new Scanner(System.in);
     
    public static void main(String[] args) {
        int a = scn.nextInt(), b = scn.nextInt(), c = scn.nextInt(), x = 0;
        while(a <= b) {
            if(c % a == 0) {
                x++;
            }
            a++;
        }
        System.out.println(x);
    }
}