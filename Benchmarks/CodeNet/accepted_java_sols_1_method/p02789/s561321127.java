import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
        if(str1.equals(str2)){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}