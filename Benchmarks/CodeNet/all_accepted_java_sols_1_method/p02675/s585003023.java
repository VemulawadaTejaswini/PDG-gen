import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Nm = N % 10;
        
        String ans = "hon";
        if(Nm == 3) {
            ans = "bon";
        } else if(Nm == 0 || Nm == 1 || Nm == 6 || Nm == 8) {
            ans = "pon";
        }
        
        System.out.println(ans);
    }
}
