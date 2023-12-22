import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        s = s.toLowerCase();
        char a = s.charAt(2);
        char b = s.charAt(3);
        char c = s.charAt(4);
        char d = s.charAt(5);
        if(s.length()==6){
            if(a==b && c==d){
                System.out.println("Yes");
            }
            else
                System.out.println("No");
        }
        else
            System.out.println("No");
            
    }}