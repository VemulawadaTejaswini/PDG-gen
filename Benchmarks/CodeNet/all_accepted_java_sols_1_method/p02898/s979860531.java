import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());

        Integer[] array = new Integer[n];
        for(int i = 0; i < array.length; ++i) {
            int tmp = sc.nextInt();
            array[i] = tmp;
        }

        int counter = 0;

        for(int i = 0; i < array.length; ++i) {
            if(array[i] >= k) ++counter;
            else continue;
        }

        System.out.println(counter);
    }
}