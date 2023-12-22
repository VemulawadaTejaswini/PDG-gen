import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int N;
    static ArrayList<String> W;

    private static void init() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        scanner.nextLine();
        W = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            W.add(scanner.nextLine());
        }
        scanner.close();
    }


    public static void main(String args[]) {
        init();

        boolean ok = true;
        char prevTail = 'a';
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(i != j) {
                    if(W.get(i).equals(W.get(j))) {
                        ok = false;
                        break;
                    }
                }
            }

            if(i != 0 && prevTail != W.get(i).charAt(0)) {
                ok = false;
            }
            prevTail = W.get(i).charAt(W.get(i).length() - 1);
        }

        if(ok) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}