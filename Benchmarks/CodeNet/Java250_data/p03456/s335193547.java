import java.util.*;

public class Main{
    public static void main(String[] argc){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int num = Integer.parseInt(a + b);
        int sq = (int)Math.sqrt(num);

        if(sq*sq == num){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}