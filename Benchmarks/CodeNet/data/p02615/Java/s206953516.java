import java.util.Scanner;
import java.util.Arrays;


public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        int sum = 0;
        int count = 0;
        Arrays.sort(a);
        n=n-1;/*最初に配置する分*/
        sum = a[n];
        n=n-1;
        int cn=n;

        for(int i=0;i<cn;i++){
            sum+=a[n];
            if(count==2){
                n--;
            } 
        }
        System.out.println(sum);
    }
}