import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        for(int i=0; i<3; i++){
            a[i] = sc.nextInt();
        }
        int cost = 10000;
        int pcost = 0;
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i != j){
                    for(int k=0; k<3; k++){
                        if(k != i && k != j){
                            pcost = Math.abs(a[j]-a[i]) + Math.abs(a[k]-a[j]);
                            if(pcost < cost){
                                cost = pcost;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(cost);
    }
}