import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void printAns(int num, ArrayList<Integer> ans) {
        Collections.sort(ans);
        String[] ansArray = new String[ans.size()];

        for (int i = 0; i < ansArray.length; i++)
            ansArray[i] = ans.get(i).toString();

        String joined = String.join(" ", ansArray);
        System.out.println(num + ": " + joined);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        // ?´???°??¨?????????
        List<Integer> primeList = new ArrayList<>();

        boolean[] primeArray = new boolean[300001];
//        System.out.println(primeArray[299998]);
        for (int i = 1; i < 300000; i++) {
            if (i % 7 == 1 || i % 7 == 6)
                primeArray[i] = true; // ?????????????´???°
        }
//        System.out.println(primeArray[299998]);
        for (int i = 1; i < Math.sqrt(300000 + 1)/7 + 1; i++) {
            for (int j = i+1; j < 300000/7 + 1; j++) {
                if ((7*j-1) % (7*i+1) == 0)
                    primeArray[7*j-1] = false;
                if ((7*j+1) % (7*i+1) == 0)
                    primeArray[7*j+1] = false;
                if ((7*j-1) % (7*i-1) == 0)
                    primeArray[7*j-1] = false;
                if ((7*j+1) % (7*i-1) == 0)
                    primeArray[7*j+1] = false;
            }
        }
        for (int i = 1; i < 300000/7 + 1; i++) {
            if (primeArray[7*i-1])
                primeList.add(7*i-1);
            if (primeArray[7*i+1])
                primeList.add(7*i+1);
        }
//        System.out.println(primeList.contains(299998));
        // done

        while (true) {
            num = sc.nextInt();
            ArrayList<Integer> ans = new ArrayList<>();
            if (num == 1) break;


            for (int prime: primeList) {
                if (num % prime == 0)
                    ans.add(prime);
            }

            printAns(num, ans);
        }

    }

}