import java.io.*;
import java.util.*;
 


class Main {
    private static int a;
    public static void main(String[] args){
    
     Scanner s = new Scanner(System.in);
    a=s.nextInt();
    int[] array= new int[a] ;
   for(int i=0;i<array.length;i++){
       array[i]=s.nextInt();
        }
   for(int x=array.length-1;x>=0;x++){
       if(x!=0){
       System.out.printf("%d",array[x]);
   }else{
    System.out.printf("%d\n",array[x]);}
   }
    }
}
    
   

