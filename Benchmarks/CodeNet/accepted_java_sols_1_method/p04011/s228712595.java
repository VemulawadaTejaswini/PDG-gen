import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Set;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int X=sc.nextInt();
        int Y=sc.nextInt();
        if(N<=K){
            System.out.println(N*X);
        }else{
            System.out.println(K*X+Y*(N-K));
        }
}
        
        
    }
