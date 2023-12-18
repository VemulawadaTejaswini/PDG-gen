import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();

        if(K<=(B-A+1)/2){
            for(int i=A; i<=A+K-1; i++){
                System.out.println(i);
            }
            for(int i=B-K+1; i<=B; i++){
                System.out.println(i);
            }
        }
        else{
            for(int i=A; i<=B; i++){
                System.out.println(i);
            }
        }
    } 
}