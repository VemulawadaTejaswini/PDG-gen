import java.io.*;
import java.util.ArrayList;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input;
        int i, j;
        
        int n = Integer.parseInt(br.readLine());
        int[] s = new int[n];
        input = br.readLine().split(" ");
        for (i = 0; i < n; i++) {
            s[i] = Integer.parseInt(input[i]);
        }

        int q = Integer.parseInt(br.readLine());
        int[] t = new int[q];
        input = br.readLine().split(" ");
        for (i = 0; i < q; i++) {
            t[i] = Integer.parseInt(input[i]);
        }
        

        int count = 0;
        ArrayList<Integer> checked = new ArrayList<Integer>();
        int target;
        for (i = 0; i < n; i++) {
            target = s[i];
            if (checked.contains(target)) continue;
            checked.add(target);
            for (j = 0; j < t.length; j++) {
                if (t[j] == target) {
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}