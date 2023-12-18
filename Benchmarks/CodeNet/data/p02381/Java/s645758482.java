import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n==0)break;
            int a[] = new int[n];
            double ave = 0.0;
            int b = 0;
            double c = 0;
            double s = 0.0;
            for(int i=0;i < n;i++){
                a[i] = sc.nextInt();
                b += a[i];
            }
            ave = b/(double)n;
            for(int i=0;i < n;i++){
                c += (double)((double)a[i] - ave)*((double)a[i] - ave);
            }
            s = Math.sqrt(c/(double)n);
            System.out.println(s);
        }
        System.out.println("");
        sc.close();
    }
}
