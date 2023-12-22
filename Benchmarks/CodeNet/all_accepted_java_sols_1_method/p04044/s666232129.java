import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int N = Integer.parseInt(in.nextLine().split(" ")[0]);
        String[] s = new String[N];
        for(int i =0; i < N; i++){
            s[i] = in.nextLine();
        }
        Arrays.sort(s);
        for(int i = 0; i < N; i++){
            System.out.print(s[i]);
        }
        System.out.println();

    }
}

