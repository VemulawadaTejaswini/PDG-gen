import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       int x=1;
       int y=1;
       int a;
       int b;
        Scanner scanner=new Scanner(System.in);
        while(x!=0&&y!=0){
         x=scanner.nextInt();
         y=scanner.nextInt();
         if(x==0&&y==0){
             break;
         }
         if(x<y){
             a=x;
             b=y;
             System.out.println(a+" "+b);
           }
         else{
            a=y;
            b=x;
             System.out.println(a+" "+b);
         }
    }
        
        
                
    }

}