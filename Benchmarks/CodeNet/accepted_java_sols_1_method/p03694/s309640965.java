import java.util.*;
import java.util.HashSet;
import java.util.Set;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]a=new int[N];
        for(int i=0;i<N;i++){
            a[i]=sc.nextInt();
        }
        int min=10000;
        for(int i=0;i<N;i++){
            if(a[i]<=min){
                min=a[i];
            }
        }
        int max=0;
        for(int i=0;i<N;i++){
            if(a[i]>=max){
                max=a[i];
            }
        }
        System.out.println(max-min);
        
        

        }
       
        
    }