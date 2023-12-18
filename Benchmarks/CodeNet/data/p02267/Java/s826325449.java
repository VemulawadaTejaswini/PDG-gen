import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> listS = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int q = Integer.parseInt(br.readLine());
        List<Integer> listT = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        
        int listSSizeBefore = listS.size();
        listS.removeAll(listT);
        int listSSizeAfter = listS.size();
        
        System.out.println(listSSizeBefore - listSSizeAfter);
    }
}