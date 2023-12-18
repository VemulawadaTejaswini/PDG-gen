import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
public class Main{
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        
        seSearch(sca);
        }
    public static int seSearch(Scanner c){
        int n = c.nextInt();
         int[] count = new int[n];
       
        for(int i = 0 ; i < n ; ++i){
            count[i]=c.nextInt();
        }
        for(int i = 1 ; i <= n ; i ++){
            System.out.print("node "+i+": key = "+count[i-1]+", ");
            if(i/2>0){
                System.out.print("parent key = "+count[i/2-1]+", ");
            }
            if(2*i<=n){
                System.out.print("left key = "+count[i*2-1]+", ");
            }
            if(2*i+1<=n){
                System.out.print("right key = "+count[i*2]+", ");
            }    
            System.out.println("");
        }
    return n;

    }
}
