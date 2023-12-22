import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ins = sc.nextLine().split(" ");
        int n = Integer.parseInt(ins[0]);
        int d = Integer.parseInt(ins[1]);
        List<List<Integer>> locations = new ArrayList<>();
        for(int i = 0;i < n;i++){
            String[] locs = sc.nextLine().split(" ");
            List<Integer> loc1 = new ArrayList<>();
            for(String loc : locs){
                loc1.add(Integer.parseInt(loc));
            }
            locations.add(loc1);
        }
        int r = 0;
        for(int i = 0;i < locations.size();i++){
            for(int j = i; j < locations.size();j++){
                double calc = 0;
                for(int k = 0;k < d;k++){
                    double o = locations.get(i).get(k) - locations.get(j).get(k);
                    calc += o * o;
                }
                calc = Math.sqrt(calc);
                if ((calc == Math.floor(calc)) && calc != 0) {
                    r++;
                }
            }
        }
        System.out.println(r);
    }
}