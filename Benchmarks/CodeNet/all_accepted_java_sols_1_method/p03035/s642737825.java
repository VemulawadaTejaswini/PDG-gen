import java.util.Scanner;

public final class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int a = stdIn.nextInt();
        int b = stdIn.nextInt();

        if(0<=a && a<=5){
            System.out.println(0);
        }else if(13<=a){
            System.out.println(b);
        }else{
            System.out.println(b/2);
        }
    }
}