import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] c = a.toCharArray();
        c[0]++;
        System.out.println(c[0]);
    }
}