import java.util.Scanner;

public class Main{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int i;
        int n=sc.nextInt();
        int[] data=new int[n];
        for(i=0;i<n;i++)data[i]=sc.nextInt();
        for(i=n-1;i>=0;i--){
            System.out.printf("%d",data[i]);
            if(i!=0)System.out.printf(" ");
        }
        System.out.println();
    }
}
