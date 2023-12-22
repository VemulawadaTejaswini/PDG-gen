

import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int a[] = new int[N];
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
        }
        
       
      
        for(int j = 1; a.length > j; j++){           
            int  s = a[j];
            int i = j - 1;

            for(int e = 0; a.length > e; e++){           
            System.out.print(a[e]);
            
            if(a.length - 1 > e){
            System.out.print(" ");
            }
            if(a.length - 1 == e){
                System.out.println();
            }
            }

           
            
            while(i >= 0 && a[i] > s){
                a[i + 1] = a[i];
                i--;
                a[i + 1] = s;
            }
        }
    
        for(int e = 0; a.length > e; e++){
           
            System.out.print(a[e]);
            
            if(a.length - 1 > e){
            System.out.print(" ");
            }
            if(a.length - 1 == e){
                System.out.println();
            }
            }

      
    }
}
