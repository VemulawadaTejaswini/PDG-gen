import java.util.Scanner;

class Main{
     public static void main(String[] args){

        Scanner as = new Scanner(System.in);
       
        int x;
        int y;

       
           
           x = as.nextInt();
           y = as.nextInt();
           
           
           

        while(true){
           
           if(x==0 && y==0){
                 break;
    }
           x = as.nextInt();
           y = as.nextInt();
           
           
           if(x<y){
              System.out.println(x+" "+y);

             }
           else{
              System.out.println(y+" "+x);

             } 
       }
   
 }
 
}