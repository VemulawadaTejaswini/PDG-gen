import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out);
        ArrayList<String> list = new ArrayList<String>();
        int N, L;
        String state = "";

        N = sc.nextInt();
        L = sc.nextInt();

        for (int i = 0; i < N; i++) {
            list.add(sc.next());
        }

        Collections.sort(list);
        
        for (int i = 0; i < N; i++) {
            state += list.get(i);
        }
        
        out.println(state);
        sc.close();
    }
}