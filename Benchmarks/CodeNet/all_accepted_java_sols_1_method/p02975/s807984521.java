    import java.util.*;
    public class Main {
        public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           int[] a = new int[n];
           
           for(int i=0;i<n;i++){
           a[i] = sc.nextInt();    
           }
           int ans = a[0];
           for(int i=1;i<n;i++){
           ans ^= a[i]; 
           }
           if(ans==0) System.out.println("Yes");
           else System.out.println("No");
        }
    }							