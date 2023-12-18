import java.util.*;
import java.lang.Object;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] weight = new int[n];
        int g1 = 0;
        int sum = 0;
        int sabun = 222222;
        int min = 222222;
        int g2 = 0;

        for(int i = 0;i<n;i++){
            weight[i] = sc.nextInt();
            sum +=weight[i];
        }

        for(int i = 0;i<n;i++){
            for(int j =0;j<=i;j++){
                g1+=weight[j];
            }
            //System.out.println("g1: "+g1);
             g2 = sum - g1;
             sabun = Math.abs(g2-g1);
            if(min>sabun){
                min = sabun;
                
            }
            g1=0;
        }
            System.out.println(min);


    }
}
