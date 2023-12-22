import java.util.Scanner;
public class Main{
    public static void main (String [] args){
        Scanner sc =new Scanner(System.in);
        int i=0;
        int n =sc.nextInt();
        int[] t;
        t = new int[n];
      
        while(i<n){
            int H =sc.nextInt();
            t[i]=H;
            i++;
        }
        System.out.print(t[n-1]);
        
        for(int b=n-2;b>=0;b--){
            
            System.out.print(" "+t[b]);
        }
        System.out.println();
       
        sc.close();
   }
 
}
