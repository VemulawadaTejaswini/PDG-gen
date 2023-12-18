import java.util.*;
public class Payment {
    public static void Main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int change = 1000-(n%1000);
        if(change == 1000) change = 0;
        System.out.println(change);
        
    }
}
