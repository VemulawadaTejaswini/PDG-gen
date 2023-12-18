import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int n = sc.nextInt();
        int x[] = new int[w];

        int i;
        for(i = 0; i < w; i++){
            x[i] = i + 1;
        }

        int j, t;
        for(j = 0; j < n; j++){
            String str = sc.next();
            String[] s =str.split(",");
            int a = Integer.parseInt(s[0]) - 1;
            int b = Integer.parseInt(s[1]) - 1;
            t = x[a];
            x[a] = x[b];
            x[b] = t;
        }

        int k;
        for(k = 0; k < w; k++){
            System.out.println(x[k]);
        }

        sc.close();

    }
}
