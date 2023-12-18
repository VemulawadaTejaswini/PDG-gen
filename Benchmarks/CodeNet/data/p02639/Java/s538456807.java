import java.util.Scanner;

public class Main {

    public Main() {
        Scanner scanner = new Scanner(System.in);
        for(int i=1;i<=5;i++){
            if(scanner.nextInt() == 0)
                System.out.println(i);

        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
