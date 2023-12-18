import java.util.Scanner;

class Main{
     public static void main(String[] args){

        Scanner as = new Scanner(System.in);
       
        int x;
        int y;
        int tr;

       
           
           x = as.nextInt();
           y = as.nextInt();
           
           if(x>y){
              tr=x;
               x=y;
              y=tr;
             }
            
           

        while(x!=0 && y!=0){
             
            System.out.println(x+" "+y);

           x = as.nextInt();
           y = as.nextInt();
           
           if(x>y){
              tr=x;
               x=y;
              y=tr;
             }
 
       }
   
 }
 
}