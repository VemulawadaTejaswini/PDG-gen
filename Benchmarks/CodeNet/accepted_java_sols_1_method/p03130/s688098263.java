import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int[] size = new int[4];
        for(int i = 0; i < 3; i++) {
            int a = scan.nextInt() - 1, b = scan.nextInt() - 1;
            size[a]++;
            size[b]++;
        }
        int two = 0, one = 0;
        for(int i = 0; i < 4; i++) {
            if(size[i] == 2) two++;
            else if(size[1] == 2) one++;
        }
        System.out.println(one == 2 && two == 2 ? "YES" : "NO");
    }
}
