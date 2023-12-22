import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args)  {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        String line;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while((line = br.readLine()) != null) {
                int num = Integer.parseInt(line);
                set.remove(num);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(set.iterator().next());
    }
}