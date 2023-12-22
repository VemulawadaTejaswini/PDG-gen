import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        if(s.charAt(0)!=s.charAt(1)){
            if(s.charAt(2)==s.charAt(3)){
                if(s.charAt(4)==s.charAt(5)){
                    System.out.println("Yes");return;
                }
            }
        }
        System.out.println("No");
    }
}