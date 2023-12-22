
import java.util.Scanner;
public class Main
{ 
    public static void main(String[] args)
    {
       int r, c;
       Scanner sc = new Scanner(System.in);  
       r = sc.nextInt();
       c = sc.nextInt();
       int [] [] arr = new int [r+1] [c+1];
       for(int i =0; i<r;i++)
       {  
          int sumR = 0;
          for(int j = 0; j<c; j++)
          {
              arr[i][j]=sc.nextInt();
              System.out.print(arr[i][j]+" ");
              sumR = sumR + arr[i] [j];
              if(j == c-1)
              {
                 System.out.println(sumR);
                 arr[i][j+1] = sumR;
              }
          }
       }
       for (int i = 0; i<c+1; i++)
       {
           int sumC = 0;
          for(int j = 0; j<r+1; j++)
          {
              sumC = sumC + arr[j][i];
              if(j==r && i!=c)
              {
               System.out.print(sumC+" ");
              }
              if(j==r && i==c)
              {
                 System.out.println(sumC);
              }   
          }
       }
    }
}

