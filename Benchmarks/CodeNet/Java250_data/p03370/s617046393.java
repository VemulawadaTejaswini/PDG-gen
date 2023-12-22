
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// ABC095 at 2018/04/24

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solveB();
    }

    private void solveA() {
        Scanner sc = new Scanner(System.in);
        char[] N = sc.nextLine().toCharArray();
        int result = 700;
        for (char c : N) {
            if ("o".equals(String.valueOf(c))) {
                result += 100;
            }
        }
        System.out.println(result);
    }

    private void solveB() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int cnt = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }
        for (Integer integer : list) {
            X -= integer;
            cnt++;
        }

        Collections.sort(list);
        int min = list.get(0);
        while(min <= X) {
            X -= min;
            cnt++;
        }
        System.out.println(cnt);

    }

    private void solveC() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);
    }

    private void solveD() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);
    }

    private void solveE() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);
    }

    private void solveF() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);
    }

}