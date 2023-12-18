import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        Set<Integer> s = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toSet());
        br.readLine();
        Set<Integer> t = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toSet());
        
        s.retainAll(t);
        System.out.println(s.size());
    }
}
