import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        int[] array = new int[loop];
        long count = 0;
        for(int i = 0; i < loop; i++) {
            array[i] = sc.nextInt();
        }
        for(int i = 0; i < (loop - 1); i++) {
            int temp = array[i];
            int next = array[i+1];
            if(next < temp){
                count += (temp - next);
                array[i+1] = temp;
            }
        }
        System.out.println(count);

    }
}
