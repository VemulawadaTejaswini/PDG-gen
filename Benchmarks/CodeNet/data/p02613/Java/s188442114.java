import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String [] str = new String[N];
        String [] result = {"AC", "WA", "TLE", "RE"};
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for(int i = 0; i < N; i++) {
            str[i] = sc.next();

            if(map.get(str[i]) == null) {
                map.put(str[i], 1);
            } else {
                int count = map.get(str[i]);
                map.put(str[i], count + 1);
            }
        }

        for(int i = 0; i < 4; i++) {
            if(map.get(result[i]) == null) {
                System.out.println(result[i] + " x " + 0);
            } else {
                System.out.println(result[i] + " x " + map.get(result[i]));
            }
        }

    }
}