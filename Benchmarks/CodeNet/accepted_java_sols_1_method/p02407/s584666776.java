import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int i;
        for(i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int j;
        
        for(i=n-1;i>=0;i--){
            System.out.printf("%d",a[i]);
            if(i>=1){
                System.out.printf(" ");
            }
        
        }
        
        System.out.println();
    }
}
