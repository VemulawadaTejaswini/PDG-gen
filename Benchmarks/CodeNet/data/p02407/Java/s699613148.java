import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            int input = scanner.nextInt();
            a[i] = input;
        }
        for (int b = n-1; b >= 0; b--) {
            System.out.print(a[b]);
            if (b != 0) {
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
}

