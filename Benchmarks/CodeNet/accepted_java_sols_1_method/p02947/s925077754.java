
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String[] s = new String[n];
        for(int i=0;i<n;i++){
            s[i] = sc.next();
        }
        Map<List<String>, Integer> codes = new HashMap<>();
        long count = 0;
        for(int i=0;i<n;i++){
            String[] st = s[i].split("");
            Arrays.sort(st);
            List<String> str = Arrays.asList(st);
            if(codes.containsKey(str)){
                int tmp = codes.get(str);
                count += (long)tmp;
                codes.put(str, tmp+1);
            }
            else{
                codes.put(str, 1);
            }
        }
        System.out.println(count);
    }
}