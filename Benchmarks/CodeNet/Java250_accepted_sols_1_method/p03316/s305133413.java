import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int s = 0;
        String n = String.valueOf(N);
        for(int i = 0; i < n.length(); i++){
            s += Character.getNumericValue(n.charAt(i));
        }
        if (N%s == 0) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}