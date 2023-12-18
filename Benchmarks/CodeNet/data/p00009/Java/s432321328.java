import java.util.Scanner;
class Main {
    static boolean[] primeList = new boolean[1000000];
    public static void prime() {
        for(int i = 0; i < 1000000; i ++) primeList[i] = true;
        primeList[0] = false; primeList[1] = false;
        for(int i = 2; i * i < 1000000; i ++) if(primeList[i]) for(int j = i * i; j < 1000000; j += i) primeList[j] = false;
    }
    public static int solve(int n) {
        int m = 0;
        for(int i = 0; i <= n; i ++) if(primeList[i]) m ++;
        return m;
    }
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        prime();
        while(scan.hasNext()) {
            int n = scan.nextInt();
            System.out.println(solve(n));
    }
}