import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int i1 = Character.getNumericValue(s.charAt(0));
        int i2 = Character.getNumericValue(s.charAt(1));

        if(i1 == 9 || i2 == 9){
            System.out.print("Yes");
        }else {
            System.out.print("No");
        }
    }
}