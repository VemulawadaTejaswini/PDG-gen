import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input;
        int i;
        
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
        int[] checked = new int[n];
        int target;
        for (i = 0; i < n; i++) {
            target = s[i];
            if (contains(checked, target)) continue;
            checked[i] = target;
            if (contains(t, target)) count++;
        }

        System.out.println(count);
    }

    public static boolean contains(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) return true;
        }
        return false;
    }
}