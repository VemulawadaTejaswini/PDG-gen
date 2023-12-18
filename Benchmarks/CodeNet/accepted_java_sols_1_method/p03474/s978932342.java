import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        String S = in.next();

        for(int i = 0; i < A; i++){
            if (!Character.isDigit(S.charAt(i))){
                System.out.println("No");
                return;
            }
        }
        if(S.charAt(A) != '-'){
                System.out.println("No");
                return;
        }
        for(int i = A+1; i < A+1+B; i++){
            if (!Character.isDigit(S.charAt(i))){
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
        in.close();
    }
}
