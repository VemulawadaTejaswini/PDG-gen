import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static boolean debug = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashMap<String,Long> map = new HashMap<>();
        for(int i=0; i< n;i++){
            char[] array = sc.next().toCharArray();
            Arrays.sort(array);

            String result = new String(array);

            long temp =0;
            if(map.containsKey(result)){
                temp = map.get(result);
            }
            map.put(result,temp+1);

        }

        long count =0;
        for(long c:map.values()){
            count += c * (c-1) / 2;
        }
        System.out.println(count);

    }
}