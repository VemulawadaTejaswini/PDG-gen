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
        int diff = 0;
        x= sc.nextInt();
        for(int i=0; i<n-2; i++){
            y= sc.nextInt();
            if(y>x){
                diff = diff+y-x;
            }
            x=y;
        }
            System.out.println(diff);
    }
}