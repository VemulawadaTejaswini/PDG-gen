import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class Main {
    private static final int bucketSize = 3;

    public static void main(String[] a) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(r.readLine());
        String[] str = r.readLine().split(" ");

        Map<Integer, int[]> hashArr = new HashMap<>();
        for (int i = 0; i < n; i++) {
            addHash(hashArr, Integer.parseInt(str[i]));
        }

        StringBuilder s = new StringBuilder();

        int firstKey = (int) hashArr.keySet().toArray()[0];
        for (Integer key : hashArr.keySet()) {
            int[] arr = hashArr.get(key);
            if (arr == null || arr.length <= 0) {
                continue;
            } else if (key != firstKey) {
                s.append(" ");
            }
            insertionSort(arr);
            for (int j = 0; j < arr.length; j++) {
                s.append(arr[j]);
                if (j != arr.length - 1) {
                    s.append(" ");
                }
            }
        }
        System.out.println(s);
    }

    private static void addHash(Map<Integer, int[]> hashArr, int value) {
        int key = value / bucketSize;

        int[] currentArray = hashArr.get(key);
        int[] newArray;
        if (currentArray == null) {
            newArray = new int[1];
            newArray[0] = value;
        } else {
            newArray = new int[currentArray.length + 1];
            System.arraycopy(currentArray, 0, newArray, 0, currentArray.length);
            newArray[currentArray.length] = value;
        }

        hashArr.put(key, newArray);
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            if (j != i - 1) {
                arr[j + 1] = key;
            }
        }
    }
}