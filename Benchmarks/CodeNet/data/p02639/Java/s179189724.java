import java.util.*;
public class Main{

     public static void main(String []args){
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
       for(int i=0;i<5;i++)
          arr[i]=sc.nextInt();
    for(int i=0;i<5;i++)
    if(arr[i]==0)
       System.out.print(i+1);
         
     }
}