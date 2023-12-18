import java.util.*;

class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] p = new int[n];

        for (int i = 0; i < p.length; i++) {
            p[i] = sc.nextInt();
        }

        Arrays.sort(p);

        int sum = 0;
        for (int i = 0; i < p.length-1; i++) {
            sum += p[i];
        }
        System.out.println(sum + p[n-1]/2);
    }
}