import java.util.*;
 
class Main{
 
    public static void main(String[] args){
        int d,r;
        double a,b,f;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        d = (int)(a/b);
        r = (int)(a%b);
        f = a/b;
        System.out.println(String.valueOf(d) + " " + String.valueOf(r) + " " + String.valueOf(f));
    }
}