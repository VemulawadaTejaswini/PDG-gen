import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    private static int MOD = 1000000007;


    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int[] nm = readIntegers(br);
        int n = nm[0];
        int m = nm[1];


        List<Turo> turos = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int[] ab = readIntegers(br);
            turos.add(new Turo(ab[0], ab[1]));
        }

        Map<Integer, List<Integer>> ans = new HashMap<>();
        List<Integer> current = new ArrayList<>();
        current.add(1);

        while(ans.size() != n - 1){
            List<Integer> next = new ArrayList<>();
            for(Iterator<Turo> ite = turos.iterator(); ite.hasNext();){
                Turo turo = ite.next();
                if (current.contains(turo.a)) {
                    List<Integer> integers = ans.get(turo.b);
                    if(integers == null) integers = new ArrayList<>();
                    integers.add(turo.a);
                    ans.put(turo.b, integers);
                    next.add(turo.b);
                    ite.remove();
                } else if (current.contains(turo.b)) {
                    List<Integer> integers = ans.get(turo.a);
                    if(integers == null) integers = new ArrayList<>();
                    integers.add(turo.b);
                    ans.put(turo.a, current);
                    next.add(turo.a);
                    ite.remove();
                }
            }

            current = next;
        }


        System.out.println("Yes");
        for (Map.Entry<Integer, List<Integer>> integerListEntry : ans.entrySet()) {
            System.out.println(integerListEntry.getValue().get(0));
        }

    }

    static class Turo {
        int a, b;

        public Turo(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    private static int readInteger(BufferedReader br) throws IOException {
        return Integer.parseInt(br.readLine());
    }

    private static int[] readIntegers(BufferedReader br) throws IOException {
        String[] s = br.readLine().split(" ");
        int[] ret = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            ret[i] = Integer.parseInt(s[i]);
        }
        return ret;
    }
}
