import java.util.*;
import static java.lang.Math.*;

public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for(int i=0; i<n; i++){
            h[i] = sc.nextInt();
        }

        int res = 0;
        while(true){
            int max = 0;
            for(int i=0; i<n; i++){
                max = max(max,h[i]);
            }
            if(max == 0) break;

            int j = 0;
            while(j<n){
                if(h[j]==0) j++;
                else{
                    res++;
                    while(j < n && h[j] > 0){
                        --h[j];
                        j++;
                    }
                }
            }
        }
        System.out.println(res);
    }
}