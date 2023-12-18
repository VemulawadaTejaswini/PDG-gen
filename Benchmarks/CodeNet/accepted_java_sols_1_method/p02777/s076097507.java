import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();
        String u = sc.next();

        if(Objects.equals(u, s))
            a-=1;
        else if(Objects.equals(u, t))
            b-=1;

        System.out.print(a + " " + b);
    }
}
