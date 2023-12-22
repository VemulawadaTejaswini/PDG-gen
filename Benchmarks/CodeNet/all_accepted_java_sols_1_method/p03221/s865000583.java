import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Map<Integer, List<Integer>> map = new HashMap<>();
        Integer[] parr = new Integer[m];
        Integer[] yarr = new Integer[m];
        for(int i = 0; i < m;i++){
            int p = sc.nextInt();
            int y = sc.nextInt();
            parr[i] = p;
            yarr[i] = y;

            if(map.containsKey(p)){
                map.get(p).add(y);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(y);
                map.put(p, list);
            }
        }

        Map<Integer, Map<Integer, String>> ansmap = new HashMap<>();
        for(Integer key : map.keySet()){
            List<Integer> list = map.get(key);
            Collections.sort(list);
            Map<Integer, String> tmpmap = new HashMap<>();
            int index = 1;
            String pre = String.format("%06d",key);
            for(Integer num : list){
                tmpmap.put(num, pre + String.format("%06d",index++));
            }
            ansmap.put(key, tmpmap);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < m;i++){
            sb.append(ansmap.get(parr[i]).get(yarr[i]));
            sb.append("\n");
        }
        System.out.println(new String(sb));
    }

}