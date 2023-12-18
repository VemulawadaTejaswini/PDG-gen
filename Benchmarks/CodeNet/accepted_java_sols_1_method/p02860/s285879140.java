import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String ss1 = s.substring(0,s.length()/2);
        String ss2 = s.substring(s.length()/2,s.length());
        System.out.println(ss1.equals(ss2)?"Yes":"No");
    }
}