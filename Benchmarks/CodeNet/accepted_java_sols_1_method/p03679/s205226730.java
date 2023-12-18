import java.util.*;

class Main {
    public static void main(String[] args){
        System.gc();
        Scanner sc = new Scanner(System.in);
        long X = Integer.parseInt(sc.next());
        long A = Integer.parseInt(sc.next());
        long B = Integer.parseInt(sc.next());
        String ans;
        if (B <= A) ans = "delicious";
        else if (B <= A + X) ans = "safe";
        else ans = "dangerous";
        System.out.println(ans);
        sc.close();
    }
}