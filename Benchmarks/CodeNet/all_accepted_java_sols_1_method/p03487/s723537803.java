import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i=0; i<N; i++){
            int num = scanner.nextInt();
            if(hashMap.containsKey(num)){
                int tmp = hashMap.get(num);
                tmp++;
                hashMap.put(num, tmp);
            }else{
                hashMap.put(num, 1);
            }
        }

        int cnt = 0;

        for(int key: hashMap.keySet()){
            int tmp = hashMap.get(key);
            if(tmp < key){
                cnt += tmp;
            }else{
                cnt += tmp - key;
            }
        }

        System.out.println(cnt);
    }
}
