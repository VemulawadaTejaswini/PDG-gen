
import static java.lang.Integer.parseInt;

public class Main {
    public static void main (String[] args) {
        String line = new java.util.Scanner ( System.in ).nextLine();
        String[] number = line.split(" ", 0);
        int[] numbers;
        numbers = new int[3];

        // ???????????????
        for (int i = 0;i <= 2; i++ ) {
            numbers[i] = Integer.parseInt(number[i]);
        }
        int[] ans = Sort (numbers);
        
        System.out.println(ans[0] + " " + ans[1] + " " + ans[2]);
    }
    public static int[] Sort(int[] number) {
        int c;
        for (int i = 0; i < 2 ;i++) {
            for (int x = 1; x <= 2 ;x++) {
                if (number[i] > number[x]) {
                    c = number[i];
                    number[i] = number[x];
                    number[x] = c;
                }
            }
        }
        return number;
    }
}