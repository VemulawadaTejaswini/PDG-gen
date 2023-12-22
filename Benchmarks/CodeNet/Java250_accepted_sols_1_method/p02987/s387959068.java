import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String first = s.substring(0,1);
        String second = s.substring(1,2);
        String third = s.substring(2,3);
        String forth = s.substring(3,4);
        if (first.equals(second)) {
            if (third.equals(forth)&& !first.equals(forth)) {
                
                System.out.println("Yes");
                return;
            }
            System.out.println("No");
            return;
        }
        
        if (first.equals(third)) {
            if (second.equals(forth)&& !first.equals(forth)) {
                
                System.out.println("Yes");
                return;
            }
            System.out.println("No");
            return;
        }
        
        if (first.equals(forth)) {
            if (second.equals(third)&& !first.equals(third)) {
                
                System.out.println("Yes");
                return;
            }
            System.out.println("No");
            return;
        }
        System.out.println("No");
    }
}