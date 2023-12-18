
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte[] state = new byte[10];
        byte[] temp = new byte[10];
        Queue<byte[]> que = new ArrayDeque<byte[]>();
        while (true) {
            for (int i = 0; i < 8; i++) {
                state[i] = (byte) sc.nextInt();
                if (state[i] == 0) state[8] = (byte) i;
            }
            state[9] = 0;
            if (check_end(state)) System.out.println(temp[9]);
            else {
                while (true) {
                    if (state[8] != 0 && state[8] != 4) {
                        temp = state.clone();
                        temp[temp[8]] = temp[temp[8] - 1];
                        temp[temp[8] - 1] = 0;
                        temp[8] -= 1;
                        temp[9]++;
                        if (check_end(temp)) break;
                        else que.offer(temp);
                    }
                    if (state[8] != 3 && state[8] != 7) {
                        temp = state.clone();
                        temp[temp[8]] = temp[temp[8] + 1];
                        temp[temp[8] + 1] = 0;
                        temp[8] += 1;
                        temp[9]++;
                        if (check_end(temp)) break;
                        else que.offer(temp);
                    }
                    if (state[8] < 4) {
                        temp = state.clone();
                        temp[temp[8]] = temp[temp[8] + 4];
                        temp[temp[8] + 4] = 0;
                        temp[8] += 4;
                        temp[9]++;
                        if (check_end(temp)) break;
                        else que.offer(temp);
                    } else {
                        temp = state.clone();
                        temp[temp[8]] = temp[temp[8] - 4];
                        temp[temp[8] - 4] = 0;
                        temp[8] -= 4;
                        temp[9]++;
                        if (check_end(temp)) break;
                        else que.offer(temp);
                    }
                    state = que.poll();
                }
                System.out.println(temp[9]);
            }
            que.clear();
        }
    }

    public static boolean check_end(byte[] a) {
        for (byte i = 0; i < 8; i++) {
            if (a[i] != i) return false;
        }
        return true;
    }
    public static boolean check_visit(byte[] a) {
        for (byte i = 0; i < 8; i++) {
            if (a[i] != i) return false;
        }
        return true;
    }
}

