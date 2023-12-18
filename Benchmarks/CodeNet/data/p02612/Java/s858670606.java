import java.util.Scanner;

public class Main {

    public Main() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if(N%1000 == 0){
            System.out.println(0);
        } else {
            System.out.println(1000-N%1000);
        }
    }

    public static void main(String[] args){
        new Main();
    }
}
