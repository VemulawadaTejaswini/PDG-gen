import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        int[] ary = {scn.nextInt(), scn.nextInt(), scn.nextInt()};
        Arrays.sort(ary);
        System.out.println(ary[0] + " " + ary[1] + " " + ary[2]);
    }
}