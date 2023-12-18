import java.util.*;
public class Main{

     public static void main(String []args){
        
        Scanner sc=new Scanner(System.in);
        
               int x=sc.nextInt(),c=0;
               int arr[]=new int[x];
               for(int i=0;i<x;i++){
                 arr[i]=sc.nextInt();
                 c++;}
               if(c==x){
                   System.out.print("0");
                    System.exit(0);}
               int count=0;
               for(int i=0;i<x;i++)
               {
                   for(int j=0;j<x;j++)
                   {
                       if(arr[i]!=arr[j] && arr[i]%arr[j]==0)
                       {




                           count++;
                           break;
                       }
                   }
               }
               System.out.println(x-count);
        }

     }
