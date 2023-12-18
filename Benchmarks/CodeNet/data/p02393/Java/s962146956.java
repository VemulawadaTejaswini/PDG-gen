import java.util.Scanner;                                                   
import java.util.*;
 
class Main{
     public static void main(String[] args){
             Scanner in = new Scanner(System.in);
             int a = in.nextInt();
             int b = in.nextInt();
             int c = in.nextInt();
             int[] sort = {a,b,c,};
             for(int i=0; i<2; i++){
              for(int j=0; j<2-i; j++){
               if(sort[j]<sort[j+1]){
                 int temp=sort[j];
                 sort[j]=sort[j+1];
                 sort[j+1]=temp;
               }
              }
             }
             
             System.out.println(sort[2] + " " + sort[1] + " " + sort[0]);

      }
}