import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=0;
        if(sc.hasNextInt())
        {
            N=sc.nextInt();
        }
        int[]Arr=new int[N];
        for(int i=0;i<N;i++)
        {
            Arr[i]=sc.nextInt();
        }
        
          int[]Arr1=new int[N];
          for(int i=0;i<N;i++)
          {
             Arr1[Arr[i]-1]=i+1;
          }
          for(int i=0;i<N;i++)
          {
          System.out.print(Arr1[i]+" ");
          }
 
        // TODO code application logic here
    }
    
}
