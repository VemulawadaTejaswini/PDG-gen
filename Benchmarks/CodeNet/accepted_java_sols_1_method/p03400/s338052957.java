import java.util.*;
import java.util.Arrays;
import java.util.Set;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int D=sc.nextInt();
        int X=sc.nextInt();
        int[]A=new int[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        int sum=N;
        for(int i=0;i<N;i++){
            for(int j=1;j*A[i]+1<=D;j++){
                sum++;
            }
        }
        System.out.println(sum+X);
        

       
        
    }}