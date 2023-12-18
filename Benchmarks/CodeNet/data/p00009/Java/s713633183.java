import java.util.*;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
        int[] a = new int[100000];
        int c = 0;
        for(int i=2;i<=999999;i++){
            int count = 0;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0)
                    count++;
            }
            if(count==0){
                a[c] = i;
                c++;
            }
        }
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            int cn = s.nextInt();
            int k = 0;
            while(a[k] < cn){
                k++;
            }
            System.out.println(k+1);
        }
    }
}