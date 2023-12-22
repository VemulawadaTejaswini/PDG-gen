import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<Integer>();
        for(int tmp = 0; tmp<n; tmp++){
            int w = sc.nextInt();
            list.add(w);
        }

        long min = Integer.MAX_VALUE;
        for(int tmp =1; tmp<n ;tmp++){
            long before = 0;
            long after =0;
            for(int tmp2 = 0; tmp2 < n ; tmp2++){
                if(tmp2 < tmp){
                    before += list.get(tmp2);

                }else{
                    after += list.get(tmp2);
                }
            }
            if(min > Math.abs(before - after)){
                min = Math.abs(before - after);
            }
        }


        System.out.println(min);
    }
}