
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] table = new int[51];
        
        for(int a = 0; a < 10; a++) {
            for(int b = 0; b < 10; b++) {
                for(int c = 0; c < 10; c++) {
                    for(int d = 0; d < 10; d++) {
                        table[a + b + c + d]++;
                    }
                }
            }
        }
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()) {
            int i = scan.nextInt();
            System.out.println(table[i]);
        }
    }
}