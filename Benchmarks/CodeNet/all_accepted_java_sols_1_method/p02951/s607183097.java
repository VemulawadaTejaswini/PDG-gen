import java.util.*;
 
class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int c = stdIn.nextInt();
        System.out.println(c-(a-b) <= 0 ? 0 : c-a+b);
    }
}