import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");
        
        if(s[0].equals(s[1]) && s[2].equals(s[3]) && !(s[0].equals(s[2]))) System.out.println("Yes");
        else if(s[0].equals(s[2]) && s[1].equals(s[3]) && !(s[0].equals(s[1]))) System.out.println("Yes");
        else if(s[0].equals(s[3]) && s[1].equals(s[2]) && !(s[0].equals(s[1]))) System.out.println("Yes");
        else System.out.println("No");
        
    }
}
