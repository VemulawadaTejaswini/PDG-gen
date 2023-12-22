import java.util.Scanner;
import java.util.Arrays; 

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int count = 1;

        while(x != 0){
            System.out.println("Case " + count + ": " + x);
            x = scan.nextInt();
            count++;
        }
    }
}