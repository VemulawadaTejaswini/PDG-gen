import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        String s = String.valueOf(S.charAt(5)) + String.valueOf(S.charAt(6));
        int n = Integer.parseInt(s);

        if(n<=4){
            System.out.println("Heisei");
        }
        else if(n>4){
            System.out.println("TBD");
        }
    }
}