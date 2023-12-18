import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        PrintWriter pw = new PrintWriter(System.out);
        
        try {
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            HashMap<Integer, Integer> hm = new HashMap<>();

            int[] a = new int[n];
            for(int i=0 ; i<n ; i++) {
                int x = Integer.parseInt(st.nextToken());
                a[i] = x;
                hm.put(x, hm.getOrDefault(x, 0) + 1);
            }

            int count = 0;
            for(int i=0 ; i<n ; i++) {
                int fr = hm.get(a[i]);
                if(a[i] == 1) {
                    if(fr == 1) count++;
                }
                else {
                    if(fr == 1 && !hm.containsKey(1)) {
                        boolean poss = true;
                        for(int j=2 ; j*j<=a[i] ; j++) {
                            if(a[i]%j == 0) {
                                if(hm.containsKey(a[i]/j) || hm.containsKey(j)) {
                                    poss = false;
                                    break;
                                }
                            }
                        }

                        if(poss) count++;
                    }
                }
            }

            pw.println(count);
        }
        finally {
            pw.flush();
            pw.close();
        }
    }
}
