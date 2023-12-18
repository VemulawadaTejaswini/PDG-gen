import java.util.*;
class Main {
    public static void main (String[] a) {
        Scanner inp = new Scanner (System.in);
        int[] mount = new int[10];
        for (int i=0;i<mount.length;i++) {
            mount[i] = inp.nextInt();
        }
        Arrays.sort(mount);
        System.out.print(mount[9]);
        System.out.print(mount[8]);
        System.out.print(mount[7]);
    }
}