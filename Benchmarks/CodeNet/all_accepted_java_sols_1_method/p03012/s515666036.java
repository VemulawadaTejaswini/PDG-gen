import java.util.*;
class Main{
    public static void main(String[] args) {
       Scanner stdIn = new Scanner(System.in); 
       int n = stdIn.nextInt();
       int[] w = new int[n];
       int s1 = 0;
       int s2 = 0;
       for(int i = 0; i < n;i++){
            w[i] = stdIn.nextInt();
            s1 += w[i];
       }
       int min = Math.abs(s1 - s2);
       for(int i = n - 1 ; i >= 0 ; i--){
           s1 -= w[i];
           s2 += w[i];
           if(Math.abs(s1 - s2) < min)
           min = Math.abs(s1 - s2);
       } 
       System.out.println(min);
    }
}