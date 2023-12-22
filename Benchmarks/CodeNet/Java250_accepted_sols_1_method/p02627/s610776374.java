import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char a = s.charAt(0);

        if ( Character.isUpperCase(a)) {
            System.out.print('A');
        } else {
            System.out.print('a');
        }
    }

}