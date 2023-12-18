import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int max;
        int min;
        int sum = 0;
        String delimiter = " ";
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int loop = sc.nextInt();
        
        for(int i = 0; i < loop; i++) {
            list.add(sc.nextInt());
        }
        
        Collections.sort(list);
        
        max = list.get(loop - 1);
        min = list.get(0);
        for(int num : list) {
            sum += num;
        }
        
        System.out.println(min + delimiter + max + delimiter + sum);
        
    }
}