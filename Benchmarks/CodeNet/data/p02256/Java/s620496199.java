import java.util.*;
 
class Main {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int i = sc.nextInt();
                int j = sc.nextInt();
        System.out.println(getGDC(i, j));
    }
 
    private static int getGDC(int i, int j) {
        if (j == 0) return i;
        return getGDC(j, i % j);
    }
}