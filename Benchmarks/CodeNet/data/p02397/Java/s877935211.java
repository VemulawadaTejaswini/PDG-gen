import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       int count=3000;
       Scanner scan= new Scanner(System.in);

       for(int i=1;i<=count;i++){
           int x=scan.nextInt();
           int y=scan.nextInt();
           if(x==0 && y==0){
               break;
           }else{
               if(x > y){
                   int temp=x;
                   x=y;
                   y=temp;
               }
               System.out.println(x+" "+y);
           }
       }
    }
}

