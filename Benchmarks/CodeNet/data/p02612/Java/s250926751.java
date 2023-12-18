import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int change = 1000-(n%1000);
        if(change == 1000) change = 0;
        System.out.println(change);
        
    }
}
