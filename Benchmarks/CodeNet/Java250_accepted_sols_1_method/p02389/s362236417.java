import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);
        int S = a * b;
        int L = 2*(a + b);
        System.out.println(S+" "+L);
    }
    
}