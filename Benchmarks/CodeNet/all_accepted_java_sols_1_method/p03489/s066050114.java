import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<input.length;i++){
            int elem = Integer.parseInt(input[i]);
            if(map.containsKey(elem)){
                map.put(elem, map.get(elem) + 1);
            }else{
                map.put(elem, 1);
            }
        }

        int count = 0;
        Set<Integer> keys = map.keySet();
        for(int key : keys){
            int value = map.get(key);
            if(value > key){
                count += (value - key);
            }else if(value < key){
                count += value;
            }
        }

        System.out.println(count);
    }
}
