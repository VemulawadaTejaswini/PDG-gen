import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String line = sc.nextLine();
        int[] h = new int[n];
        String[] ll = line.split(" ");

        for (int i = 0; i < n; i++) {
            h[i] = Integer.parseInt(ll[i]);
        }

        boolean isLiner = true;
        int max = h[0];
        for (int i = 0; i < n; i++) {
            if(max > h[i]){
                isLiner = false;
            }

            if(max < h[i] - 1){
                max = h[i] - 1;
            }

        }

        if (isLiner) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        return;
    }
}
