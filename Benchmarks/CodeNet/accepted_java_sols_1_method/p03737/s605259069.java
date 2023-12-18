import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        String sum ="";
        sum = "" + s1.charAt(0) + s2.charAt(0) + s3.charAt(0);
        sum = sum.toUpperCase();
        System.out.println(sum);
    }
}