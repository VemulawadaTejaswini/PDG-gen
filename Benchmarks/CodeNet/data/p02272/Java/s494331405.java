import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {
    static final int MAX = 1000000001;
    static int count = 0;

    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] S = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] R = mergeSort(S, 0, n-1);
        
        StringBuilder sb = new StringBuilder();
        sb.append(R[0]);
        for(int i = 1; i < R.length - 1; i++) {
            sb.append(" ");
            sb.append(R[i]);
        }
        System.out.println(sb.toString());
        System.out.println(count);
    }

    public static int[] mergeSort(int[] s, int left, int right) {
        if(left == right) {
            int[] ret = new int[2];
            ret[0] = s[left];
            ret[1] = MAX;
            return ret;
        } else {
            int mid = left + (right - left) / 2;
            int[] l = mergeSort(s, left, mid);
            int[] r = mergeSort(s, mid+1, right);
            return merge(l, r);
        }
    }

    public static int[] merge(int[] left, int[] right) {
        int[] r = new int[(left.length-1) + (right.length-1) + 1];
        int ri = 0;
        int li = 0;
        for(int i = 0; i < r.length - 1; i++) {
            if(left[li] <= right[ri]) {
                r[i] = left[li];
                li++;
            } else {
                r[i] = right[ri];
                ri++;
            }
            count++;
        }
        r[r.length - 1] = MAX;

        return r;
    }
}