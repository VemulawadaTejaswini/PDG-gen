import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int T = sc.nextInt();
        int S = sc.nextInt();
        if(T * S >= D){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
