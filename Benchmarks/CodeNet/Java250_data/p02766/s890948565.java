import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        double tmp = Math.log(n)/Math.log(r);
        System.out.println((int)tmp+1);
    }
}
