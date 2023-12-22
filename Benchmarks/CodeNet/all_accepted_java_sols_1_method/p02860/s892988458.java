import java.util.*;

public class Main{
    public static void main(String []args){
       Scanner entrada = new Scanner(System.in);
       int A = entrada.nextInt();
       boolean x = false;
       String c = entrada.next();
       String b = "";String v ="";
       for(int i=0;i<A;i++){
        b = c.substring(0,i+1);
        v = b+b;
        
        if(v.equals(c)){            
            x = true;            
        }
       }if(x==true){
           System.out.println("Yes");
       }else{
           System.out.println("No");
       }
       
    }
}