import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(reader.readLine());

        String[] s=reader.readLine().split(" ");
        int[] num=new int[t+t];

        for (int i = 0; i <s.length ; i++) {
            num[Integer.parseInt(s[i])]++;
        }
        for (int i = 1; i <=t ; i++) {
            System.out.println(num[i]);
        }
    }
}