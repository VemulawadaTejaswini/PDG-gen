import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double L=sc.nextDouble();
    
        double ans=(L/3)*(L/3)*(L/3);
        
        System.out.println(String.format("%.6f",ans));
    }
}