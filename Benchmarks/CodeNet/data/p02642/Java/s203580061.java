import java.util.*;
public class Main{

     public static void main(String []args){
        
        Scanner sc=new Scanner(System.in);
        
               int x=sc.nextInt();
               int arr[]=new int[x];
               for(int i=0;i<x;i++){
                 arr[i]=sc.nextInt();
                 }
               
               int count=0;
               for(int i=0;i<x;i++)
               {
                   for(int j=0;j<x;j++)
                   {
                       if(arr[i]>0 && arr[j]>0 && i!=j && arr[i]%arr[j]==0)
                       {




                           count++;
                           break;
                       }
                   }
               }
               if(count>0)
               System.out.println(x-count);
               else
               System.out.print("0");
        }

     }
