import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //String str = sc.next();
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double rA = 0.08;
        double rB = 0.1;
        
        for(int i=12; i<1001; i++){
            if(Math.floor(i*rA) == A && Math.floor(i*rB) == B){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}