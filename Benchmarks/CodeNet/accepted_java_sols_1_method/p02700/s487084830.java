import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
       Scanner stdIn= new Scanner(System.in);

        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int c = stdIn.nextInt();
        int d = stdIn.nextInt();
        for(;;){
            if(c<=b){
                System.out.println("Yes");
                break;
            }
            c=c-b;
            if(a<=d){
                 System.out.println("No");
                break;
            }
            a=a-d;
        }
    }
}
