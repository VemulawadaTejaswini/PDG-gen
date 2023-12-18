import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < 3;i++){
            int k = scan.nextInt();
            map.put(k, map.getOrDefault(k,0)+1);
        }

        if(map.get(5) == 2 && map.get(7) ==1){
            System.out.println("YES");
            return;
        }

        System.out.println("NO");
    }
}
