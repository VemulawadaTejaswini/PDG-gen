import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int res = N / 2;
        if(N % 2 != 0){
            res++;
        } 
        
        sc.close();
        
        System.out.println(res);
    }
}