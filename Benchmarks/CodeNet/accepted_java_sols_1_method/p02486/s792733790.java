import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            if (n == 0 && k == 0)
                break;

            int nMatches = 0;
            for (int x = 1; x <= n; x++)
                for (int y = x+1; y <= n; y++)
                    for (int z = y+1; z <= n; z++)
                        if (x + y + z == k)
                            nMatches++;

            System.out.println(nMatches);
        }
    }
}