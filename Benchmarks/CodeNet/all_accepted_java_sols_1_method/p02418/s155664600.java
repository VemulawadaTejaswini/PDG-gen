import java.util.*;
public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String ring = str1 + str1.substring(0, str1.length());
        if(ring.contains(str2)){
            System.out.println("Yes");
        }
        else System.out.println("No");

    }
}
