import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 1; ; i++){
            int a;
            a = input.nextInt();
            if (a == 0){
                break;
            }
            System.out.printf("Case %d: %d\n", i, a);
        }
    }

}
