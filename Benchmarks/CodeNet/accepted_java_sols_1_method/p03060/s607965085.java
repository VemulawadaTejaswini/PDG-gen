import java.util.*;


class Main{

     public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        int t = 0;
        int[] v= new int[x];
        int[] c= new int[x];
        
        for(int i = 0 ; i < x; i++){
            v[i]=sc.nextInt();
            
        }
        for(int i = 0 ; i < x; i++){
            c[i]=sc.nextInt();
            
        }
        for(int i = 0 ; i < x; i++){
        
            if( v[i] > c[i] ){
                t = t + v[i]-c[i];
            }
        }
        System.out.println(t);
        
        
     }
}