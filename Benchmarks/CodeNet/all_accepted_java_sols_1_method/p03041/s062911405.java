import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        String str = sc.next();
        
        String str1 = str.substring(0,num2 - 1);
        String str2 = str.substring(num2 - 1, num2);
        String str3 = str.substring(num2);

        System.out.println(str1 + str2.toLowerCase() + str3);
    }
}