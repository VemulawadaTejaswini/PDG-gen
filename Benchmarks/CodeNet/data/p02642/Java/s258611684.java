
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for(int i=0;i<N;i++){
            a.add(sc.nextInt());
        }
        Collections.sort(a);

        int count = 0;
        List<Integer> a_buffer = new ArrayList<>();
        while(a.size() != 0){
            int x = a.get(0);
            a.remove(0);

            boolean flag = true;
            while(a.size() != 0 && a.get(0) == x){
                flag = false;
                a.remove(0);  //同じ数字をすべて取り除く
            }
            if(flag){
                count++;
            }

            while(a.size() != 0){
                if(a.get(0) % x != 0){
                    a_buffer.add(a.get(0));
                    a.remove(0);
                }else if(a.get(0) / x < 2){     //これ以上割り切れることがない
                    a_buffer.addAll(a);
                    a.clear();
                    break;
                }
            }
            a.addAll(a_buffer);
            a_buffer.clear();
        }

        System.out.println(count);
    }
}
