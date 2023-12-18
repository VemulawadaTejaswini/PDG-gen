import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] input = new int[num];
        int i;
        for (i = 0; i < num; i++) {
            input[i] = sc.nextInt();
        }
        for(i = num - 1; i >= 0; i--) {
            System.out.print(input[i]);
            if (i != 0) System.out.print(" ");
        }
        System.out.println();
    }
}
