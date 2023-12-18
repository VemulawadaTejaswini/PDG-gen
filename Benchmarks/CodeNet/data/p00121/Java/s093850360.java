import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            HashMap<Integer, Integer> map = new HashMap<>();
            Queue<int[]> que = new ArrayDeque<int[]>();
            int[] state = {0,1,2,3,4,5,6,7,0};
            int[] give = new int[8];
            map.put(key(state), 0);
            que.add(state.clone());
                while (que.size() > 0) {
                    state = que.remove();
                    if (state[8] != 0 && state[8] != 4) {
                        int[] temp = state.clone();
                        temp[temp[8]] = temp[temp[8] - 1];
                        temp[temp[8] - 1] = 0;
                        temp[8] -= 1;
                        if (!map.containsKey(key(temp))) {
                            map.put(key(temp), map.get(key(state)) + 1);
                            que.add(temp.clone());
                        }
                    }
                    if (state[8] != 3 && state[8] != 7) {
                        int[] temp = state.clone();
                        temp[temp[8]] = temp[temp[8] + 1];
                        temp[temp[8] + 1] = 0;
                        temp[8] += 1;
                        if (!map.containsKey(key(temp))) {
                            map.put(key(temp), map.get(key(state)) + 1);
                            que.add(temp.clone());
                        }
                    }
                    if (state[8] < 4) {
                        int[] temp = state.clone();
                        temp[temp[8]] = temp[temp[8] + 4];
                        temp[temp[8] + 4] = 0;
                        temp[8] += 4;
                        if (!map.containsKey(key(temp))) {
                            map.put(key(temp), map.get(key(state)) + 1);
                            que.add(temp.clone());
                        }
                    } else {
                        int[] temp = state.clone();
                        temp[temp[8]] = temp[temp[8] - 4];
                        temp[temp[8] - 4] = 0;
                        temp[8] -= 4;
                        if (!map.containsKey(key(temp))) {
                            map.put(key(temp), map.get(key(state)) + 1);
                            que.add(temp.clone());
                        }
                    }
                }
        while (sc.hasNext()) {
            for (int i = 0; i < 8; i++) {
                give[i] = sc.nextInt();
            }
            System.out.println(map.get(key(give)));
        }
    }


    public static int key(int[] a) {
        int j = 1, key = 0;
        for (int i = 0; i < 8; i++) {
            key += a[i] * j;
            j *= 10;
        }
        return key;
    }

}

