import java.lang.reflect.Array;
import java.util.*;
public class Main {




    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.next());
        int b = Integer.parseInt(scan.next());
        int c = Integer.parseInt(scan.next());

        int[] array = new int[3];
        array[0]=a;
        array[1]=b;
        array[2]=c;

        Arrays.sort(array);

        String term1 = Integer.toString(array[2]) + Integer.toString(array[1]);
        System.out.println(Integer.parseInt(term1) + array[0]);

    }
}