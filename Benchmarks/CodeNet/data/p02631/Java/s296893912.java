import java.nio.Buffer;
import java.util.Scanner;
import java.util.Vector;

public class cf {
    public static Scanner r=new Scanner(System.in);
    public static void main(String[] args) {
        int n=r.nextInt();
        int []a=new int[n];
        int sum=0;
        for(int i=0;i<n;++i){
            a[i]=r.nextInt();
            sum^=a[i];
        }
        for(int i=0;i<n;++i){
            System.out.print((sum^a[i])+" ");
        }
    }
}
