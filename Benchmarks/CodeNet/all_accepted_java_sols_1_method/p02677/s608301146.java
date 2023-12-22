import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        int A = sn.nextInt();
        int B = sn.nextInt();
        int H = sn.nextInt();
        int M = sn.nextInt();

        double HDgree = M*6;
        double MDgree = H*30;
        double Dgree = 0;
        double n = 0.5*M;

        MDgree = MDgree + n;
        
        if(HDgree > MDgree){
            Dgree = HDgree - MDgree;
        }else{
            Dgree = MDgree - HDgree;
        }
        
        Dgree = Math.abs(Dgree);

        double c = Math.pow(A, 2) + Math.pow(B, 2) - 2*A*B*Math.cos(Math.toRadians(Dgree));

        double result = Math.sqrt(c);

        System.out.println(result);
    }
}