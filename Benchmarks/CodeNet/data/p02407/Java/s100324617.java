import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a;
        a = new int[100];
        int j=0;
        for(j=0;j<n;j++){
            a[j] = sc.nextInt();
        }

        for(int i=n-1;i>=0;i--){
            System.out.print(a[i]);
            if(i!=0)    System.out.print(" ");
        }
        System.out.println();
        sc.close();
    }
}
