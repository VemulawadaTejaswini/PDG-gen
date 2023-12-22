import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int s = 0;
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        while(a <= b) {
            if(c % a++ == 0) {
                s++;
            }
        }
        System.out.println(s);
    }
}