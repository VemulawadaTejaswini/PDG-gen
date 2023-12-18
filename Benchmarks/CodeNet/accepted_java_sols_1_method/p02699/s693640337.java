import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
       Scanner stdIn= new Scanner(System.in);

        int x = stdIn.nextInt();
        int y = stdIn.nextInt();
        if(x<=y){
            System.out.println("unsafe");
        }else{
            System.out.println("safe");
        }
    }
}
