import java.util.Scanner;

class Main {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] output = new int[n];
        long totalXOR = 0;
        for (int i = 0; i < n; i++) {
            output[i] = s.nextInt();
            totalXOR = totalXOR ^ output[i];
        }
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                System.out.print(" " + (output[i] ^ totalXOR));
            } else {
                System.out.print(output[i] ^ totalXOR);
            }
        }
    }
}