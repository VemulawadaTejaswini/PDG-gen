import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int ar[]=new int[n];
        int x=in.nextInt();
        for (int i = 0; i < n; i++) {
            ar[i]=in.nextInt();
        }
        Arrays.sort(ar);
        int sum=0,c=0;
        while(x-->0){
            sum=sum+ar[c];
            c++;
        }
        System.out.println(sum);
    }
}