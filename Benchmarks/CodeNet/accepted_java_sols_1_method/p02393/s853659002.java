import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
            int a = stdIn.nextInt();
            int b = stdIn.nextInt();
            int c = stdIn.nextInt();

            if(a>b){
                int temp = a;
                a = b;
                b = temp;
            }
            if(b>c){
                int temp = b;
                b = c;
                c = temp;
            }
            if(a>b){
                int temp = a;
                a = b;
                b = temp;
            }

            System.out.println(a +" "+ b +" "+ c);
            stdIn.close();
    }
}
