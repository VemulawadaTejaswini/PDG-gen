import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rep = scan.nextInt();
        long sum = 0, max = -1000001, min = 1000001;
        int[] data = new int[rep];

        for (int i = 0; i < rep; i++)
            data[i] = scan.nextInt();

        for (int i = 0; i < rep; i++) {
            sum += data[i];
            if (data[i] < min)
                min = data[i];
            if (data[i] > max)
                max = data[i];
        }

        System.out.printf("%d %d %d\n", min, max, sum);
    }
}
