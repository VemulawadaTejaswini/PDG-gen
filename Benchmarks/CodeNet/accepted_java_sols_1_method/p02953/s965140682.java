import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n+1];
        h[0] = 0;
        for(int i = 0;i<n;i++){
            h[i+1] = sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            if(h[i]<h[i+1]){
                h[i+1]-=1;
            }else if(h[i]==h[i+1]){

            }else{
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}