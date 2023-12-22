import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int K = scan.nextInt();
        String S = scan.next();
        int leng = S.length();
         if(leng<=K){
             System.out.println(S);
         }else{
             System.out.println(S.substring(0,K)+"...");
         }
    }
}

