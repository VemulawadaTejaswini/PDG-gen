import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static ArrayList<Integer> primeList;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        primeList = prime();
        while ((line = br.readLine()) != null) {
            int n = Integer.parseInt(line);
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (checkPrime(i) && checkPrime(n + 1 - i)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    static boolean checkPrime(int a) {
        if (a <= 1) {
            return false;
        }
        for (int i : primeList) {
            if (a < i * i) {
                return true;
            }
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    static ArrayList<Integer> prime() {
        int SIZE = 10000000;
        ArrayList<Integer> primeList = new ArrayList<Integer>(SIZE);
        int n = 10000;
        primeList.add(2);
        primeList.add(3);
        for (int i = 5; i <= n; i += 2) { //????±?????\???°??????
            boolean wflag = false; //???????????????????????????
            for (int j = 1; primeList.get(j) * primeList.get(j) <= i; j++) {
                // ????±??????°??????????????\????????¨???????´???°??§????????????
                if (0 == i % primeList.get(j)) { //???????????????????´???°??§?????????
                    wflag = true;
                    break;
                }
            }
            if (!wflag) { //???????????§????????????????????£??????
                primeList.add(i); //?´???°??¨????????°????????????
            }
        }
        return primeList;
    }

    static int[] ai() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");
        int n = lines.length;
        int[] list = new int[n];
        while (n-- > 0) {
            list[n] = Integer.parseInt(lines[n]);
        }
        return list;
    }

    static int ip() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(br.readLine());
    }

}