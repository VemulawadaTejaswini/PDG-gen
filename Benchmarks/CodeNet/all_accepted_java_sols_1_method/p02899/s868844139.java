import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 1;i <= n;i++){
            int num = sc.nextInt();
            map.put(num, i);
            list.add(num);
        }

        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < n;i++){
            sb.append(map.get(list.get(i)));
            sb.append(" ");
        }

        sb.deleteCharAt(sb.length() -1);
        System.out.println(sb.toString());
    }
}