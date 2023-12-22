import java.util.*;

public class Main {
    public static void main(String[] args) {
        int N;
        String[] Si = null;
        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            Si = new String[N];
            for (int i = 0; i < N; i++) {
                Si[i] = sc.next();
            }
        }
        Map<String,Integer> map = new HashMap<>(N);
        int max =0;
        for(String s : Si){
            int i = map.getOrDefault(s,0);
            map.put(s,++i);
            if(max < i){
                max = i;
            }
        }
        List<String> list = new LinkedList<>();
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if (entry.getValue() == max){
                list.add(entry.getKey());
            }
        }
        String[] resultArr = new String[list.size()];
        list.toArray(resultArr);
        Arrays.sort(resultArr);
        for (int i = 0; i < resultArr.length; i++) {
            System.out.println(resultArr[i]);
        }
    }
}
