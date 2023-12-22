import java.math.BigDecimal;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int n = Integer.parseInt(s.split(" ")[0]);
        int a = Integer.parseInt(s.split(" ")[1]);
        int b = Integer.parseInt(s.split(" ")[2]);

        if(n * a < b){
            System.out.println(n * a);
        } else {
            System.out.println(b);
        }


        return;
    }
}
