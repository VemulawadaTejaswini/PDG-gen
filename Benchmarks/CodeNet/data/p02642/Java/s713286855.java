
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            int N = sc.nextInt();
            Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
            Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
            int num[] = new int[N];
            for(int i = 0; i < N; i++){
                num[i] = sc.nextInt();
            }
            Arrays.sort(num);
            for(int i = N - 1; i >= 0; i--){
                map1.put(i, num[i]);
                map2.put(i, num[i]);
            }
            for(int a : map1.keySet()){
                for(int b : map2.keySet()){
                    if(a == b){
                        continue;
                    }
                    if((map1.get(a) % map2.get(b)) == 0){
                        N--;
                        break;
                    }
                }
            }
            System.out.println(N);


        }
}