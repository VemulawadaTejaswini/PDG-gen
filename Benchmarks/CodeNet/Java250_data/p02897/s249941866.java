import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        double res = 0;
        
        for(int i = 1; i <= n; i++){
            if(i % 2 != 0) res++;
        }

        System.out.println(res / ((double)n));
    }
}


class Pair<K, V> extends AbstractMap.SimpleEntry<K, V> {
 
    public Pair(K key, V value) {
        super(key, value);
    }
 
    public Pair<V, K> swap() {
    	return new Pair<V, K>(getValue(), getKey());
    }
}
