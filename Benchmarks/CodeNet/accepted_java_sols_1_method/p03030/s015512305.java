import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String[] place = new String[N];
        int[] value = new int[N];
        for(int i=0; i<N; i++) {
            place[i] = sc.next();
            value[i] = Integer.parseInt(sc.next());
        }
        
        int[] ans = new int[N];
        for(int i=0; i<N; i++) {
            int count = 0;
            for(int j=0; j<N; j++) {
                if(i==j) continue;
                if(place[i].equals(place[j])) {
                    if(value[i] < value[j]) {
                        count++;
                    }
                }else {
                    if(place[i].compareTo(place[j]) > 0) {
                        count++;
                    }
                }
            }
            ans[count] = i;
        }
        
        for(int i : ans) {
            System.out.println(i+1);
        }
    }
}
