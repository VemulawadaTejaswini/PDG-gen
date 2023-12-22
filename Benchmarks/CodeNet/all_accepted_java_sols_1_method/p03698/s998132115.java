import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        List<Character> alpha = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
        //int[] index = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
        boolean[] visited = new boolean[26];

        char[] cs = reader.readLine().toCharArray();

        for (int i = 0; i < cs.length; i++) {
            int pos = alpha.indexOf(cs[i]);

//            System.out.print(cs[i]);

            if (visited[pos] == false)
                visited[pos] = true;
            else {
                System.out.print("no");
                return;
            }

        }

        System.out.print("yes");
//        PrintWriter writer = new PrintWriter(System.out);
//
//        writer.close();


    }
}
