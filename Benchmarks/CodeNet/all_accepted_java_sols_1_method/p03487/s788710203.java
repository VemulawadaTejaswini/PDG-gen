import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int is[] = new int[l];
        for (int i = 0;i < l;++i){
            is[i] = scanner.nextInt();
        }
        int j = 0,k,alr = 0;
        HashMap<Integer,Integer> counter = new HashMap<>();
        for (int i = 0;i < l;++i){
            counter.put(is[i],counter.containsKey(is[i]) ? counter.get(is[i]) + 1 : 1);
        }
        for (int key:counter.keySet()){
            if(counter.get(key) > key){
                alr += counter.get(key) - key;
            }
            else if(counter.get(key) < key){
                alr += counter.get(key);
            }
        }
        System.out.println(alr);
    }
}