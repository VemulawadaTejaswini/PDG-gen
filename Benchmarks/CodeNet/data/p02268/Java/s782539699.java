import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {
    public static boolean find(int[] ary, int searchNum) {
        int start = 0;
        int end = ary.length - 1;

        while(start <= end) {
            int pivot = start + (end - start) / 2;

            if(ary[pivot] < searchNum) {
                start = pivot + 1;
            } else if(ary[pivot] > searchNum) {
                end = pivot - 1;
            } else {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] S = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int q = Integer.parseInt(br.readLine());
        int [] T = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int count = 0;
        for(int i = 0; i < q; i++) {
            if(find(S, T[i])) {
                count++;
            }
        }
        System.out.println(count);
    }
}