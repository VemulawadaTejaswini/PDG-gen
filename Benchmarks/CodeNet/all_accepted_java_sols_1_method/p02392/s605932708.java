import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        String str3 = in.next();
        int a, b, c;
        a = Integer.parseInt(str1);
        b = Integer.parseInt(str2);
        c = Integer.parseInt(str3);
        if(a < b && b < c) {
        System.out.println("Yes");
        }else{
        System.out.println("No");
        }
    }
    
}