import java.util.*;

public class Main {


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       String str1 = sc.nextLine();
       String str2 = sc.nextLine();

       if (str1.equals(str2)) {
           System.out.println("Yes");
           return;
       }

        for (int i = 0; i < str1.length(); i++) {
            str1 = str1.charAt(str1.length() - 1) + str1.substring(0, str1.length() -1);
            if(str1.equals(str2)) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");;
    }

}
