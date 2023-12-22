import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int sum = 0;
        int[] p = new int[n];
        for(int i=0; i<n; i++){
            p[i]=sc.nextInt();
            } 
        Arrays.sort(p);
        for(int i=0; i<k; i++){
            sum=sum+p[i];
        }
            System.out.println(sum);
    }
}