import java.util.Scanner;
import java.util.Arrays;


public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
/*        int[] a = new int[n]
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
*/      
        int x = 0;
        int y = 0;
        long diff = 0;
        x= sc.nextInt();
        for(int i=0; i<n-1; i++){
            y= sc.nextInt();
//            System.out.print(y+" ");
            if(y<x){
                diff = diff+x-y;
            }else if(x<y){
                x=y;
            }
//            System.out.println(x);
        }
            System.out.println(diff);
    }
}