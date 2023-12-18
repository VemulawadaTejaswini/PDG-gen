import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        int cnt = 0;

        if(a == b && b == c){
            System.out.println(1);
        }else if(a == b || a ==c || b ==c){
            System.out.println(2);
        }else{
            System.out.println(3);
        }

    }
}
