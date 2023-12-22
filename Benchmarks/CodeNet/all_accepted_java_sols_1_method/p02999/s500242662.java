import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int x = stdIn.nextInt();
        int a = stdIn.nextInt();

        if(x<a){
            System.out.println(0);
        }else{
            System.out.println(10);
        }
    }
}