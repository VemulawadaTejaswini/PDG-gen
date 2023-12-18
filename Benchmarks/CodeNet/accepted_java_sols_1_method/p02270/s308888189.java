import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] l = new int[n];
        int max = 0;
        int acc = 0;

        for (int i=0; i<n; i++) {
            l[i] = scanner.nextInt();
            acc += l[i];
            max = Math.max(max,l[i]);
        }

        int left = max;
        int right = acc;

        while (left < right) {
            int p = (left+right)/2;
            int id = 0;
            int sum = 0;
            for (int i=0; i<n; i++) {
                if (sum + l[i] > p) {
                    sum = l[i];
                    id++;
                }else {
                    sum += l[i];
                }
                if (id == k)
                    break;
            }
            if (id == k)
                left = p+1;
            else
                right = p;
        }
        System.out.println(left);

    }
}

