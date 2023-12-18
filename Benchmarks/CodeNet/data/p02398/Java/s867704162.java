import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       Scanner scan= new Scanner(System.in);
       int x=scan.nextInt();
       int y=scan.nextInt();
       int M=scan.nextInt();

       int count=0;
       for(;x<=y;x++){

           if(M%x==0){
               count++;
           }
       }

        System.out.println(count);
    }
}

