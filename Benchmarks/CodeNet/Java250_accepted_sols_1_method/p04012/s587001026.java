import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bl = true;
        char[] array = sc.next().toCharArray();
        Arrays.sort(array);
        for (int i=0;i<array.length;i++) {
            char c = array[i];
            int j = i+1;
            int count = 1;
            while (j < array.length && c == array[j]) {
                count++;
                i = j;
                j++;
            }
            if (count%2==1) {
                bl = false;
                break;
            }
        }
        System.out.println(bl?"Yes":"No");

    }
}