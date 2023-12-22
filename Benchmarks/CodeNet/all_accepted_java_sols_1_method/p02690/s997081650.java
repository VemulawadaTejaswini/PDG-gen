import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Harry on 5/3/20.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int x = scanner.nextInt();
        HashMap<Integer, Long> map = new HashMap<>();
        for(int i=-1000; i<=1000; i++){
            map.put(i, (long)Math.pow(i, 5));
        }
        calc:
        for(int cur=-1000; cur<=1000; cur++){
            for(int other: map.keySet()){
                if(map.get(cur)-map.get(other)==x){
                    System.out.println(cur+" "+other);
                    break calc;
                }
            }
        }
    }
}
