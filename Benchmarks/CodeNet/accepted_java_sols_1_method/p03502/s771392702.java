import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N,sum_N=0,R;
        N=sc.nextInt();
        R=N;
        while(R!=0){
            sum_N+=R%10;
            R=R/10;
        }
        if(N%sum_N==0) System.out.println("Yes");
        else System.out.println("No");
        }
}