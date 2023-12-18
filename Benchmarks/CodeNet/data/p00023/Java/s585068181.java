import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static double xa, ya, ra, xb, yb, rb;
    public static void main(String[] args) {
        while(read()){

        }
    }

    static boolean  read(){
        if(!sc.hasNext())return false;
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            xa = sc.nextDouble();
            ya = sc.nextDouble();
            ra = sc.nextDouble();
            xb = sc.nextDouble();
            yb = sc.nextDouble();
            rb = sc.nextDouble();
            solve();
        }
        return true;
    }

    static void solve(){
        double d = distance();
        if(d > ra+rb){
            System.out.println(0);
        }else if(ra > d+rb){
            System.out.println(2);
        }else if(rb > d+ra){
            System.out.println(-2);
        }else{
            System.out.println(1);
        }
    }

    static double distance(){
        return Math.sqrt((xb - xa)*(xb - xa) + (yb - ya)*(yb - ya));
    }
}