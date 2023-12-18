import java.util.Scanner;

//0609
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), l[] = new int[m], r[] = new int[n];
        for (int i = 0; i < m; i++)
            l[i] = sc.nextInt();
        for (int i = 0, s = 0; i < m; i++, r[l[i] - 1] += n - s)
            for (int j = 0, t = sc.nextInt(); j < n; j++)
                if (t == l[i]) {
                    r[j]++;
                    s++;
                }
        for (int i : r)
            System.out.println(i);
    }
}

