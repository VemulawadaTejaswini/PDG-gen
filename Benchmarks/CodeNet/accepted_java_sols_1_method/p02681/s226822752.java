import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)!=b.charAt(i)){
                System.out.println("No");return;
            }
        }
        System.out.println("Yes");
    }
}
