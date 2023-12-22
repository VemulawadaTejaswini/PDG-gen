import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        HashMap<String,Integer> hmap = new HashMap<String, Integer>();
        int max = 0;

        for(int i=0;i<N;i++){
            String S = sc.next();
            if (hmap.containsKey(S)) {
                int count = hmap.get(S) + 1;
                hmap.put(S,count);
                max = Math.max(max,count);
            } else {
                hmap.put(S,1);
                max = Math.max(max,1);
            }
        }
        ArrayList<String> ans = new ArrayList<>();

        for (String key : hmap.keySet()) {
            if(hmap.get(key) == max){
                ans.add(key);
            }
        }
        Collections.sort(ans);

        for (String s : ans){
            System.out.println(s);
        }

    }
}






