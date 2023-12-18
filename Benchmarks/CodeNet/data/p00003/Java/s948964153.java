import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a==Math.sqrt(Math.pow(b,2)+Math.pow(c,2))){
            System.out.println("SI");
         }else if(b==Math.sqrt(Math.pow(a,2)+Math.pow(c,2))){
            System.out.println("SI"); 
         }else if(c==Math.sqrt(Math.pow(a,2)+Math.pow(b,2))){
            System.out.println("SI");
         }else{
             System.out.println("NO");}
    }
    
}