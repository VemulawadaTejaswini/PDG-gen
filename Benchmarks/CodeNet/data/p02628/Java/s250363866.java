import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] sa = br.readLine().split(" ");
        String[] array = br.readLine().split(" ");

        int n = Integer.parseInt(sa[0]);
        int k = Integer.parseInt(sa[1]);
        
        List<Integer> list = Arrays.asList(array).stream().map(Integer::valueOf).sorted().collect(Collectors.toList());
        

        int ans = 0;
        
        for(int i=0;i<k;i++) {
            ans+=list.get(i);
        }
        
        System.out.println(ans);
    }
}
