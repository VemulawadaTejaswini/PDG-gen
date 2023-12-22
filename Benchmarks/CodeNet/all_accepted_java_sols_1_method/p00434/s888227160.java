import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] l = new int[31];
        for (int i = 0; i < 28; i++) {
            l[sc.nextInt()]++;
        }
        for (int i = 1; i < 31; i++) {
            if (l[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
