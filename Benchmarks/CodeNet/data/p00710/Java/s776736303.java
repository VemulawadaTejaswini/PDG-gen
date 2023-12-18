import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] before = new int[51];
        int[] temp = new int[51];
        while(input.hasNext()) {
            int n = input.nextInt(), r = input.nextInt();
            if(n == 0 && r == 0)
                break;
            for(int i = n, j = 1; i >= 1 && j <= n; i--, j++) {      //Initialize
                before[j] = i;
            }
            for(int i = 1; i <= r; i++) {
                int p = input.nextInt(), c = input.nextInt();
                for(int j = 1; j <= p - 1; j++) {
                    temp[j] = before[j];
                }
                for(int k = p; k <= p + c - 1; k++) {
                    before[k - p + 1] = before[k];
                }
                for(int j = c + 1, k = 1; j <= p + c - 1 && k <= p - 1; j++, k++) {
                    before[j] = temp[k];
                }
            }
            System.out.println(before[1]);
        }
    }
}

