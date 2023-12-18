import java.util.Scanner;

class Main{
     public static void main(String[] args){

        Scanner as = new Scanner(System.in);
       
        int a;
        int b;
        int c;
        int count=0;

       
           
        a = as.nextInt();
        b = as.nextInt();
        c = as.nextInt();


        for(int i=a;i<=b;i++){
                if(c%i==0)
                   count++;
             }

        System.out.println(count);
           
           
           

           
   
 }
 
}