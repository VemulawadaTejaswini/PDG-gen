import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        List<String> list = new ArrayList<String>();
        for (int i = 0; i <N ; i++) {
            char[] chars = sc.next().toCharArray();
            Arrays.sort(chars);
            list.add(new String(chars));
        }
        
        Map<String, Long> map =  list.stream().collect(
                Collectors.groupingBy(x -> x, Collectors.counting())
        );
        
        Long cmb = 0L;
        for(Long c: map.values()) {
            if(c <= 1) continue;
            cmb += c*(c-1)/2;
        }
                
        System.out.println(cmb);



    }
}