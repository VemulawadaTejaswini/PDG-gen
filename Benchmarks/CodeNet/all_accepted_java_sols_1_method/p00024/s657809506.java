import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        while(sc.hasNext()){
            double v = sc.nextDouble();
            int n=0;
            while(v>=9.8*Math.sqrt(5*n/4.9))n++;
            System.out.println(n+1);
        }
 
    }
}