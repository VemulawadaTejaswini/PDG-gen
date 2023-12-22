import java.util.Scanner;
import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        int k = stdIn.nextInt();
        int x = stdIn.nextInt();

        for(int i = x-k+1;i <= x+k-1;i++) {
            System.out.println(i);
        }
    }

}