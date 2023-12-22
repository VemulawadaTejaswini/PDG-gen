import java.util.Scanner;
import java.util.LinkedList;
import java.lang.Math;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        char s1 = s.charAt(2),
        s2 = s.charAt(3),
        s3 = s.charAt(4),
        s4 = s.charAt(5);

        if(s1 == s2 && s3 == s4){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}