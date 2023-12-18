import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();

        for(int i=1; i<4; i++) {
            if(s.charAt(i-1) == s.charAt(i)) {
                System.out.println("Bad");
                return;
            }
        }
        System.out.println("Good");


    }
}