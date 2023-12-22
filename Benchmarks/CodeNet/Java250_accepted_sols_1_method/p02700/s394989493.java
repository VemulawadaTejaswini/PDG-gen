import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        sc.close();
        int tk = (c + b - 1) / b;
        int ao = (d + a - 1) / d;
        if(tk <= ao){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}