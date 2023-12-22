import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer[]> values = new ArrayList<Integer[]>();
        for (int i = 0; i < N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            values.add(new Integer[]{a, b, c});
        }
        int[] tmp = {0,0,0};
        for(Integer[] v : values){
            if (v[2] != 0){
                int i = 0;
                for(Integer p: v){
                    tmp[i] = p;
                    i++;
                }
                break;
            }
        }

        for (int cx = 0; cx < 101; cx++) {
            for (int cy = 0; cy < 101; cy++) {
                int h = Math.max(0, tmp[2] + Math.abs(tmp[0] - cx) + Math.abs(tmp[1]-cy));
                int f = 0;
                for(Integer[] v : values){
                    if (!(v[2] == Math.max(h-Math.abs(v[0]-cx) - Math.abs(v[1] - cy),0))){
                        f = 1;
                        break;
                    }
                }
                if (f == 0){
                    System.out.print(String.format("%d %d %d", cx, cy, h));
                    return;
                }
            }
        }
    }
}