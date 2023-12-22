import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int[] h = new int[n];
        for(int i = 0;i<h.length;i++) {
            h[i] = stdIn.nextInt();
        }
        int[] count = new int[n];
        int k = 0;
        for(int i = 0;i<h.length-1;i++) {
            if(h[i]>=h[i+1]) {
                count[k] += 1;
            } else {
                k++;
            }
        }
        Arrays.sort(count);
        System.out.println(count[count.length-1]);

    }
}