import java.util.*;

public class Main{

    public static void main(String a[])
        throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
        while(true){
            int n = scan.nextInt();
            if(n==0)break;
            int sum=0;
            for(int i=0;i<n/4;i++)sum+=scan.nextInt();
            System.out.println(sum);

        }
    }
}