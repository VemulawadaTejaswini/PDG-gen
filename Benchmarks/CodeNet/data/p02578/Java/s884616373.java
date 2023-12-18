import java.util.Scanner;
import java.util.Arrays;


public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
       int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }      
        int diff=0;
        int tmp=0;
        for(int i=0; i<n-1; i++){
            tmp = a[i+1]-a[i];
            if(tmp>0){
                diff=diff+tmp;
            }    
        }
            System.out.println(diff);
    }
}