import java.util.*;
public class Main { 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        if(n % 2 == 1)
            cnt++;
        
        System.out.println((n/2 + cnt) / (n * 1.0));
    }

}