import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,a,b;
        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        int c,d;
        c = a*n;
        if(b<c){
            d = b;
        }else{
            d = c;
        }
        System.out.println(d);
    }
}