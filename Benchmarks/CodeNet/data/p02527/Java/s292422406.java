import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] a) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(r.readLine());
        String[] str = r.readLine().split(" ");

        int[] arr = strToIntArray(str);
        int maxValue = maxValue(arr);

        int[] bucket = new int[maxValue + 1];
        for (int i = 0; i < n; i++) {
            bucket[arr[i]] += 1;
        }

        int index = 0;
        for (int i = 0; i < bucket.length; i++) {
            while (bucket[i] > 0) {
                arr[index] = i;
                bucket[i] --;
                index ++;
            }
        }

        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n; i++) {
            s.append(arr[i]);
            if (i != n - 1) {
                s.append(" ");
            }
        }

        System.out.println(s);
    }

    private static int[] strToIntArray(String[] str) {
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        return arr;
    }

    private static int maxValue(int[] arr) {
        int max = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

/*
??\???????????????
34
33 43 62 29 8 52 56 56 19 11 51 43 5 8 93 30 66 69 32 17 47 72 68 80 23 49 92 64 69 51 27 90 24 5499

6
5 4 3 2 1 5499
*/