import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = N/100;
        int b = a*100+a*10+a;
        if(N <= b)    System.out.println(b);
        else System.out.println(b+111);
    }
}