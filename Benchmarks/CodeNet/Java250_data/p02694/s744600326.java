import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();

        long money = 100;
        long cou = 0;
        while(money<X){
        money = (long)(money*1.01);
            cou++;
        }
                System.out.println(cou); 
        }
}