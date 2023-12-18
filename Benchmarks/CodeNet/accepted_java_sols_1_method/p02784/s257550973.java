import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        long H = sc.nextInt();
        long N = sc.nextInt();
        long sum = 0;
        for(int i=0;i<N;i++) sum+=sc.nextInt();
        if(H-sum<=0) System.out.println("Yes");
        else System.out.println("No");
    }
}