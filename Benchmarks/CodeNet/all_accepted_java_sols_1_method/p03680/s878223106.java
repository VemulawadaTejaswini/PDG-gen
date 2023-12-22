import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int[] buttons = new int[total + 1];
        for (int i = 1; i <= total; i++) {
            buttons[i] = sc.nextInt();
        }
        int num = 1;
        int i = 0;
        do {
                num = buttons[num];
                i++;
                if (num == 2){
                        break;
                }
        } while (i <= total);
        if (num == 2) {
                System.out.println(i);
        }
        else {
                System.out.println("-1");
        }
    }
}