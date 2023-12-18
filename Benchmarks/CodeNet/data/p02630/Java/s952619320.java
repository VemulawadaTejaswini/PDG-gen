import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] a= new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        int q=sc.nextInt();
        int b=0;
        int c=1;
        int[][] bc= new int[q][2];
        for(int i=0; i<q; i++){
            bc[i][b]=sc.nextInt();
            bc[i][c]=sc.nextInt();
        }
        long sum=0;
        int count1=0;
        int count2=0;
        for(int j=0; j<q; j++){
            for(int i=0; i<n; i++){
                if(a[i]==bc[j][b]){
                    a[i]=bc[j][c];
                }
            }
            for(int i=0; i<a.length; i++){
                sum += a[i];
            }
            System.out.println(sum);
            sum=0;
        }
    }
}