import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n>m) {
            int t = n;
            n = m;
            m = t;
        } 
        if(n==1 && m == 2) {
            System.out.println(3);    
        }else if(n == 1 && m == 3) {
            System.out.println(2);
        }else {
        System.out.println(1);
    }
    }
}