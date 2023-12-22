import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        ArrayList<ArrayList<Integer>> arys =
                new ArrayList<ArrayList<Integer> >();
        HashMap<Integer,Boolean> map = new HashMap<Integer, Boolean>();
        for(int i = 0; i< n; ++i){
            arys.add(new ArrayList<Integer>());
            for(int j = 0; j < d; ++j){
                Integer value =  sc.nextInt();
                arys.get(i).add(value);
            }
        }
        for(int i = 1; i < 1000; ++i){
            map.put(i * i,true);
        }
        int ans = 0;
        for(int i = 0; i < n; ++i){
            for(int j =i + 1; j < n; ++j){
                Integer res = Main.cal(arys.get(i),arys.get(j));
                if(map.get(res) == null){

                } else {
                    ++ans;
                }
            }
        }
        System.out.println(ans);

    }

    public static Integer cal(ArrayList<Integer>a, ArrayList<Integer>b) {
        Integer k = 0;
        for (int i = 0; i < a.size(); ++i) {
            k += (a.get(i) - b.get(i)) * (a.get(i) - b.get(i));
        }
        return k;
    }

}