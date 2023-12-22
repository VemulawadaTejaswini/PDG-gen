import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(br.readLine());
        HashSet<Long> set = new HashSet<>();
        for (int i = 0; i < n; i++){
            long num = Long.parseLong(br.readLine());
            if(set.contains(num)) set.remove(num);
            else set.add(num);
        }
        System.out.println(set.size());
    }
}
