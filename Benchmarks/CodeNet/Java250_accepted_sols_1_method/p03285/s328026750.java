import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        boolean isBreak = false;

        for(int i=0; i<=25; i++) {
            for(int j=0; j<15; j++) {
                if(price == 4*i + 7*j) {
                    System.out.println("Yes");
                    isBreak = true;
                    break;
                }
            }
            if(isBreak) {
                break;
            }
        }
        if(!isBreak) {
            System.out.println("No");
        }
    }
}
