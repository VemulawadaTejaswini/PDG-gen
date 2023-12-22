import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int tate = scanner.nextInt();
        int yoko = scanner.nextInt();
        System.out.printf("%d %d\n", tate*yoko, (tate+yoko)*2);
        scanner.close();
    }
}
