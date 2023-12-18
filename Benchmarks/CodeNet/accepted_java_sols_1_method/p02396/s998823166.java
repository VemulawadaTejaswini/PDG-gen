import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       int count=10000;
       Scanner scan= new Scanner(System.in);

       for(int i=1;i<=count;i++){
           int x=scan.nextInt();
           if(x==0){
               break;
           }else{
               System.out.println("Case "+i+": "+x);
           }
       }
    }
}

