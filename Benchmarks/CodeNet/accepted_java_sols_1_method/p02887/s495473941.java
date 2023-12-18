

import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> ar = Arrays.stream(sc.next().split("")).collect(Collectors.toList());

        int cnt = 1;
        String temp = ar.get(0);
        for (int i = 1; i < ar.size(); i++) {
            if (!ar.get(i).equals(temp)) {
                temp = ar.get(i);
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}