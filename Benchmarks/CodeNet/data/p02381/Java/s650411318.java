import java.util.Scanner;

//Solution:

public class Main {
    public static void main(String[] args) {
                Scanner f = new Scanner(System.in);
        // fill in the dictionary with the initial value
        while(f.hasNext()) {
            int num = f.nextInt();
            int[] entries = new int[num];
            float sum = 0;
            float std = 0;
            for (int i = 0; i < num; i++) {
                int temp = f.nextInt();
                entries[i] = temp;
                sum += temp;
            }
            float average = sum / num;
            for (int i = 0; i < num; i++) {
                std += Math.pow((entries[i] - average), 2);
            }
            std = std / num;
            System.out.println(Math.sqrt(std));
        }
    }
}
