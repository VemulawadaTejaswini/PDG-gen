import java.util.Arrays;
import java.util.Scanner;
 
//選択ソート
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }
        int cnt = new Main().selectionSort(A);
        String ans = Arrays.toString(A);
        System.out.println(ans.replace("[", "").replace(",", "").replace("]", ""));
        System.out.println(cnt);
 
    }
 
    int selectionSort(int[] array) {
        int cnt = 0; // 交換回数
        for (int i = 0; i < array.length - 1; i++) { // 最後の要素1つだけのときはやらなくていいのでn-1
            int minv = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minv]) {
                    minv = j;
                }
            }
            if (minv != i) {
                int tmp = array[i];
                array[i] = array[minv];
                array[minv] = tmp;
                cnt++;
            }
        }
        return cnt;
    }
 
}
