import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
       int A = entrada.nextInt();
       if(A==0){
           System.out.println("No");
       }else if(A>0){
           Boolean x = false;
           for(int i=1;i<=9;i++){
               for(int c=1;c<=9;c++){
                   if(A == i*c){
                        x = true;
                   }
               }
           }if(x==true){
               System.out.println("Yes");
           }else{
               System.out.println("No");
           }
       }
       
    }
}