
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String[] inputs = input1.split(" ");
        
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        
        int i = 1;
        int count = 0;
        while(true) {
            if (i >= b) {
                break;
            }
            count++;
            i += (a - 1);
        }
        System.out.println(count);
    }
}