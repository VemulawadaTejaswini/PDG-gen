import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Main {
    private static final int bucketSize = 3; // ???????????\????????§3????????????????????????

    public static void main(String[] a) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(r.readLine());
        String[] str = r.readLine().split(" ");

        Map<Integer, ArrayList> hashArr = new HashMap<>();
        for (int i = 0; i < n; i++) {
            addHash(hashArr, Integer.parseInt(str[i]));
        }

        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n - 1; i++) {
            ArrayList<Integer> arr = hashArr.get(i);
            if (arr == null || arr.isEmpty()) {
                continue;
            }
            insertionSort(arr);
            for (int j = 0; j < arr.size(); j++) {
                s.append(arr.get(j));
                if (j != arr.size() - 1) {
                    s.append(" ");
                }
            }
            if (i != n - 2) {
                s.append(" ");
            }
        }
        System.out.println(s);
    }

    private static void addHash(Map<Integer, ArrayList> hashArr, int value) {
        int key = value / bucketSize;

        ArrayList<Integer> tmp = hashArr.get(key);
        if (tmp == null || tmp.isEmpty()) {
            tmp = new ArrayList<>();
        }

        tmp.add(value);
        hashArr.put(key, tmp);
    }

    private static void insertionSort(ArrayList<Integer> arr) {
        int insertIndex;
        for (int i = 1; i < arr.size(); i++) {
            insertIndex = i;
            for (int j = i - 1; j >= 0; j--) {
                if (arr.get(i) < arr.get(j)) {
                    insertIndex = j;
                } else {
                    break;
                }
            }
            if (insertIndex != i) {
                int tmp = arr.get(i);
                arr.remove(i);
                arr.add(insertIndex, tmp);
            }
        }
    }
}