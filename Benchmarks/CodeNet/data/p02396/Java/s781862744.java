import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int c = 1;
        while(x != 0) {
            System.out.println("Case " + c + ": " + x);
            c++;
            x = scan.nextInt();
        }
    }
}
