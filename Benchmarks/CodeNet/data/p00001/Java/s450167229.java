import java.util.*;

class Main
{
    public static void main(String[] a)
        {
            int[] mt = new int[10];
            int i;
            Scanner scan = new Scanner(System.in);
            for (i = 0; i < 10; i++) {
                mt[i] = scan.nextInt();
            }
            Arrays.sort(mt);
            for (i = 9; i > 6; i--) {
                System.out.println(mt[i]);
            }
        }
}