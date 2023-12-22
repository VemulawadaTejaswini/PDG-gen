import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.next());
        List<Integer> list = new ArrayList<>();
        int res = 0;
        for(int x=1; x<=num;x++) {
            list.add(Integer.parseInt(sc.next()));
        }
        res = list.get(0);
        for(int x=2; x<=num; x++) {
            res -= list.get(x-1);
        }
        if(res<0){
            res = res*-1;
        }
        for(int x=2; x<=num;x++) {
            int temp = 0;
            for(int y=1; y<=x; y++) {
                temp += list.get(y-1);
            }
            for(int z=1+x; z<=num; z++){
                temp -= list.get(z-1);
            }
            if(temp<0){
                temp = temp*-1;
            }
            res = res<temp?res:temp;
        }
        System.out.println(res);
    }
}
