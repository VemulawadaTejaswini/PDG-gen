import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int N = sc.nextInt();
        for(int i = 0; i<N; i++) {
            int x = sc.nextInt();
            int c = (map.containsKey(x))? map.get(x): 0;
            map.put(x,++c);
        }
        int sum = 0;
        for(int k: map.keySet()) {
            if(k-map.get(k)>0) {
                sum += map.get(k);
            }else {
                sum += map.get(k)-k;
            }
        }
        System.out.println(sum);
    }
}