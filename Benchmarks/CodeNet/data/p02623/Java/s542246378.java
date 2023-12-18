

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n1 = in.nextInt();
        final int n2 = in.nextInt();
        int k = in.nextInt();
        in.nextLine();
        final Deque<Integer> first = new ArrayDeque<>();
        final Deque<Integer> second = new ArrayDeque<>();
        for (int i = 0; i < n1; i++) {
            first.addLast(in.nextInt());
        }
        in.nextLine();
        for (int i = 0; i < n2; i++) {
            second.addLast(in.nextInt());
        }
        in.nextLine();
        int res = 0;
        while (!first.isEmpty() || !second.isEmpty()) {
            if (!first.isEmpty() && !second.isEmpty()) {
                if (first.getFirst() < second.getFirst()) {
                    if (k >= first.getFirst()) {
                        k -= first.removeFirst();
                        res++;
                    } else {
                        break;
                    }
                } else {
                    if (k >= second.getFirst()) {
                        k -= second.removeFirst();
                        res++;
                    } else {
                        break;
                    }
                }
            } else if (!first.isEmpty()) {
                if (k >= first.getFirst()) {
                    k -= first.removeFirst();
                    res++;
                } else {
                    break;
                }
            } else {
                if (k >= second.getFirst()) {
                    k -= second.removeFirst();
                    res++;
                } else {
                    break;
                }
            }
        }
        System.out.println(res);
    }
}
