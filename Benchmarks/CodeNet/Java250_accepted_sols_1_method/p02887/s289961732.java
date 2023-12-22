import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       String[] arrA = sc.next().split("");
        long result = 0;
        String a = "";
        for(String b : arrA){
          if(!a.equals(b)){
            a = b;
            result ++;
         }

        }

        System.out.println(result);
    }
}
