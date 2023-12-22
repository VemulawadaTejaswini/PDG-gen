import java.util.Scanner;

public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
        int n = stdIn.nextInt();
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();

        if(n * a > b){
            System.out.println(b);
        }else{
            System.out.println(n * a);
        }
	}
}
