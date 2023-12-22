import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int k = stdIn.nextInt();

        int counter = 1;
        while(n >= Math.pow(k, counter)){
            counter++;
        }

        System.out.println(counter);
    }
}