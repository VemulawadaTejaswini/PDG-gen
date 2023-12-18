import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            int n ,k,x,y;
            Scanner input =  new Scanner(System.in);
            n=input.nextInt();
            k=input.nextInt();
            x=input.nextInt();
            y=input.nextInt();
            if(n>k){
            System.out.println((k*x)+((n-k)*y));}
            else{
                System.out.println(n*x);
            }
        }

}