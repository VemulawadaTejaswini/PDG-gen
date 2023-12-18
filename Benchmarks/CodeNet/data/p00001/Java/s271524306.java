import java.util.*;
public class Main {
    public static void main (String[] args) {
        Scanner inp = new Scanner (System.in);
        int[] mount = new int[10];
        for (int i=0;i<mount.length;i++) {
            mount[i] = inp.nextInt();
        }
        Arrays.sort(mount);
        System.out.println(mount[9]);
        System.out.println(mount[8]);
        System.out.println(mount[7]);
    }
}