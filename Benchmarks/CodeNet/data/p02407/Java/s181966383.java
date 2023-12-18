import java.util.Scanner;
import java.util.TreeSet;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int n;
            n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                if(i!=(n-1))System.out.print(a[n-i-1]+" ");
                else System.out.println(a[n-i-1]);
            }
        
}
}

