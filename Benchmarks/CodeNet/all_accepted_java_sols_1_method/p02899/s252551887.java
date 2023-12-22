
import java.util.*;

public class Main {

    /* チェックリスト
     * intの範囲を超えていないか
     * TLEしそうな処理の有無
     */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] humans = sc.nextLine().split(" ");
        int[] students = new int[n];
        for(int i = 0;i < n;i++){
            int num = Integer.parseInt(humans[i]);
            students[num - 1] = i + 1;
        }
        for(int student : students){
            System.out.print(student+" ");
        }
        System.out.println();
    }
}