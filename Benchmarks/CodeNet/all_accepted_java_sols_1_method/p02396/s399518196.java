import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int x;
        for(int i = 1; i <= 10000; i++){
            x = scan.nextInt();
            if(x == 0){
                break;
            }
            System.out.println("Case " + i + ": " + x);
        }
    }
}