
import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int k = sc.nextInt();
        Long[] a = new Long[x];
        for(int i = 0;i < x;i++){
            a[i] = sc.nextLong();
        }
        Long[] b = new Long[y];
        for(int i = 0;i < y;i++){
            b[i] = sc.nextLong();
        }
        Long[] c = new Long[z];
        for(int i = 0;i < z;i++){
            c[i] = sc.nextLong();
        }

        Arrays.sort(a, Comparator.reverseOrder());
        Arrays.sort(b, Comparator.reverseOrder());
        Arrays.sort(c, Comparator.reverseOrder());

        int ai = 0;
        int bi = 0;
        int ci = 0;

        Map<String, Long> values = new HashMap<>();
        values.put(ai + "_"+ bi + "_"+ ci, a[ai]+b[bi]+c[ci]);
        Map<String, Boolean> visited = new HashMap<>();
        visited.put(ai + "_"+ bi + "_"+ ci, true);
        for(int i = 0;i < k;i++){
            long max = 0;
            String maxKey = "";
            for(String key : values.keySet()){
                long v  = values.get(key);
                if(max < v){
                    max = v;
                    maxKey = key;
                }
            }

            values.remove(maxKey);
            System.out.println(max);
            ai = Integer.parseInt(maxKey.split("_")[0]);
            bi = Integer.parseInt(maxKey.split("_")[1]);
            ci = Integer.parseInt(maxKey.split("_")[2]);
            if(ai < x-1 && !visited.containsKey((ai+1) + "_"+ bi + "_"+ ci)){
                visited.put((ai+1) + "_"+ bi + "_"+ ci, true);
                values.put((ai+1) + "_"+ bi + "_"+ ci, a[ai+1]+b[bi]+c[ci]);
            }
            if(bi < y-1 && !visited.containsKey(ai + "_"+ (bi+1) + "_"+ ci)){
                visited.put(ai + "_"+ (bi+1) + "_"+ ci, true);
                values.put(ai + "_"+ (bi+1) + "_"+ ci, a[ai]+b[bi+1]+c[ci]);
            }
            if(ci < z-1 && !visited.containsKey(ai + "_"+ bi + "_"+ (ci+1))){
                visited.put(ai + "_"+ bi + "_"+ (ci+1), true);
                values.put(ai + "_"+ bi + "_"+ (ci+1), a[ai]+b[bi]+c[ci+1]);
            }
        }
    }
}
