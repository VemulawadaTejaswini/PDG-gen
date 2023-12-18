import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int N = scanner.nextInt();
        int K = scanner.nextInt();

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i=0; i<N; i++){
            int tmp = scanner.nextInt();
            if(hashMap.containsKey(tmp)){
                int cur = hashMap.get(tmp);
                cur++;
                hashMap.put(tmp, cur);
            }else{
                hashMap.put(tmp, 1);
            }
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int key: hashMap.keySet()){
            arrayList.add(hashMap.get(key));
        }

        Collections.sort(arrayList);

        int delete = arrayList.size() - K;

        if(delete <= 0){
            System.out.println(0);
            return;
        }

        int cnt = 0;

        for(int i=0; i<delete; i++){
            cnt += arrayList.get(i);
        }

        System.out.println(cnt);

    }
}
