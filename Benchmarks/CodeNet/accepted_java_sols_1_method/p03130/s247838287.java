import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int c[] = new int[4];
        for(int i = 0;i < 3 * 2;++i)++c[sc.nextInt() - 1];
        int tc = 0;
        for (int i = 0;i < 4;++i){
            if(c[i] == 1 || c[i] == 3)++tc;
        }
        if(tc == 0 || tc == 2) System.out.println("YES");
        else System.out.println("NO");
    }

}


