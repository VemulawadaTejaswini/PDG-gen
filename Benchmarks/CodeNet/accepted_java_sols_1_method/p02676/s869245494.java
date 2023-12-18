import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.next();
        sc.close();

        if(s.length() > k) {
        String new_s = s.substring(0,k); 
            System.out.println(new_s + "...");
        }else{
            System.out.println(s);
        }

    }
}
