import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] d = new int[N];
        int sum = 1;

        for(int i=0; i<N; i++){
            d[i] = sc.nextInt();
            if(i>0){
                for(int j=0; j<i; j++){
                    if(d[i]==d[j]){
                        break;
                    }
                    if(j==i-1){
                        sum += 1;
                    }
                }
            }
        }
        System.out.println(sum);
    } 
}