import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String result = ":(";
        if (a <= 8 && b <= 8) result = "Yay!";
      
        System.out.println(result);
    }
}
