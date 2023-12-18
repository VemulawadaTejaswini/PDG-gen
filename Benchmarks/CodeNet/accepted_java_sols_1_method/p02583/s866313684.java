import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        int counter = 0;
        for (int i = 0; i < l.length; i++) {
            l[i] = sc.nextInt();
        }
        for (int i = 0; i < l.length - 2; i++) {
            for (int j = i + 1; j < l.length - 1; j++) {
                for (int j2 = j + 1; j2 < l.length; j2++) {
                    if (l[i] != l[j] && l[j] != l[j2] && l[j2] != l[i]
                    &&  l[i] + l[j] > l[j2]
                    &&  l[j] + l[j2] > l[i]
                    &&  l[j2] + l[i] > l[j]) {
                        counter++;
                    }
                }
            }
        }
        System.out.println(counter);
        sc.close();
    }
}