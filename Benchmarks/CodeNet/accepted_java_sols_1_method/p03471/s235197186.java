import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Y = sc.nextInt();
        int ansMan = -1;
        int ansGosen = -1;
        int ansSen = -1;

        for (int man = 0; man <= N; man++) {
            for (int gosen = 0; gosen <= N - man; gosen++) {
                for (int sen = 0; sen <= N - man - gosen; sen++) {
                    if (man * 10000 + gosen * 5000 + sen * 1000 == Y && man + gosen + sen == N) {
                        ansMan = man;
                        ansGosen = gosen;
                        ansSen = sen;
                    }
                }
            }
        }
        System.out.println(ansMan);
        System.out.println(ansGosen);
        System.out.println(ansSen);
        sc.close();
    }

}