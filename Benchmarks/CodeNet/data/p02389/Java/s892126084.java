import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        int W=(2*x)+(2*y);
        System.out.println(x*y+" "+W);
    }
}
