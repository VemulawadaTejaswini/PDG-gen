
import java.util.*;

public class D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for(int i=0;i<N;i++){
            a.add(sc.nextInt());
        }
        Collections.sort(a);

        int count = 0;
        int last = 0;
        List<Integer> a_buffer = new ArrayList<>();
        while(a.size() != 0 && last < 1000){
            int x = a.get(0);
            last = x;
            a.remove(0);
            boolean flag = true;
            while(a.size() != 0 && a.get(0) == x){
                flag = false;
                a.remove(0);
            }
            if(flag){
                count++;
            }
            for(int i=0;i<a.size();i++){
                if(a.get(i) % x != 0){
                    a_buffer.add(a.get(i));
                }
            }
            a.clear();
            a.addAll(a_buffer);
            a_buffer.clear();
        }

        while(a.size() != 0) {
            int x = a.get(0);
            a.remove(0);
            boolean flag = true;
            while (a.size() != 0 && a.get(0) == x) {
                flag = false;
                a.remove(0);
            }
            if (flag) {
                count++;
            }
        }

        System.out.println(count);
    }
}