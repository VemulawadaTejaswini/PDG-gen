import java.util.*;


public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        int n = Math.abs(a-b);

        if (n >= 2) {
          System.out.println(Math.max(a, b)+Math.max(a, b)-1);
        // } else if (n == 1){
        //   System.out.println(a + b);
        } else {
          System.out.println(a + b);
        }

    }
}