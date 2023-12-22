import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        HashMap<String,Long> map =  new HashMap<>();
        
        for(int i = 0; i < a; i++){
            String s = sc.next();
            char[] c = s.toCharArray();
            Arrays.sort(c);
            s = new String(c);
            Long cnt = (map.containsKey(s) ? map.get(s) + 1 : 1);
			map.put(s, cnt);
        }

        long count = 0;
        for(Long l: map.values()){
            count = count + (l * (l -1) / 2);
        }
        
        System.out.print(count);
    }
}