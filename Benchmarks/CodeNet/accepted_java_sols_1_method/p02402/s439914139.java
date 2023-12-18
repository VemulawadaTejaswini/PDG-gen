import java.util.Scanner;
import java.util.Arrays;
class Main{
    // 解答参考にして作った解答

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int indexArray = sc.nextInt();
        int[] array = new int[indexArray];
        // 配列に収納する
        for (int i = 0; i < indexArray; i++) {
            array[i] = sc.nextInt();
        }
    //最小値、最大値、合計値を求める
    int min = array[0];
    int max = array[0];
    long sum = 0;
        for (int i = 0; i < indexArray; i++) {
            min = Math.min(min, array[i]);
            max = Math.max(max, array[i]);
            sum += array[i];
        }
        System.out.println(min + " " + max + " " + sum);
    // System.out.println(Arrays.toString(array));
    }
}
