import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> si = new HashMap<String, Integer>();

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            String s;
            s = sc.next();
            si.put(s,si.getOrDefault(s,0)+1);
        }


        Iterator it = si.entrySet().iterator();
        ArrayList arr = new ArrayList();
        int currentMax = 0;

        while(it.hasNext()) {
            Map.Entry<String,Integer> set = (Map.Entry<String, Integer>) it.next();

            if (set.getValue()>currentMax) {
                arr.clear();
                arr.add(set.getKey());
                currentMax = set.getValue();
            }

            else if (set.getValue()==currentMax) {
                arr.add(set.getKey());
            }

            else {
            }
        }
        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
