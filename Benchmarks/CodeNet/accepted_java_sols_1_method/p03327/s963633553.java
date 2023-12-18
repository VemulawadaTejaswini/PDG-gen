import java.util.*;

class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String num = sc.next();
        
        if (num.length() == 4) {
            System.out.println("ABD");
        } else {
            System.out.println("ABC");
        }
    }
}