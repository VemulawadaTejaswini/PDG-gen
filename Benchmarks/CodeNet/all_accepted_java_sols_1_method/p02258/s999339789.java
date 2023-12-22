import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int rt[] = new int[n];
        int diff[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            rt[i] = Integer.parseInt(sc.next());  
        }

        int minv = rt[0];
        int maxv = rt[1] - rt[0];
        for (int j = 1; j < n; j++) {
            maxv = Math.max(maxv, rt[j] - minv);
            minv = Math.min(minv, rt[j]);
        }

        System.out.println(maxv);
    }
}