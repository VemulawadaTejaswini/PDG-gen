import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[3];
        array[0] = sc.nextInt();
        array[1] = sc.nextInt();
        array[2] = sc.nextInt();
        Arrays.sort(array);
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            array[2] *= 2;
        }
        System.out.println(array[0] + array[1] + array[2]);
    }
}
