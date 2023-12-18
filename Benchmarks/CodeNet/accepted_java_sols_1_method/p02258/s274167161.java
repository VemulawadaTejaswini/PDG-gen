import java.util.Scanner;

class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int maxv = array[1] - array[0];
        int minv = array[0];
        for (int i = 1; i < array.length; i++) {
            maxv = Math.max(maxv, array[i] - minv);
            minv = Math.min(minv, array[i]);
        }
        System.out.println(maxv);
    }
}

