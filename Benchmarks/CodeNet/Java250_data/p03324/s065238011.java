import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        long n = sc.nextLong();
        if(d==0 && n==100) System.out.println(101);
        else if(d==0) System.out.println(n);
        else if(d==1 && n== 100) System.out.println(101*100);
        else if(d==1) System.out.println(n*100);
        else if(d==2 && n== 100) System.out.println(101*10000);
        else System.out.println(n*10000);
    }
}