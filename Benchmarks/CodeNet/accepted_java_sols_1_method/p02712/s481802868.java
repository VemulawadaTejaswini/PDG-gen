import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        
        for(int a=1; a<=n; a++){
            if(a%3!=0 && a%5!=0)
                sum += a;
        }
        
        System.out.println(sum);
    }
}