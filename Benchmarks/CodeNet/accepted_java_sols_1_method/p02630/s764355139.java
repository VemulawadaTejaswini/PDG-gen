import java.util.Scanner;

class Main {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] freq = new int[100001];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int x = s.nextInt();
            sum += x;
            freq[x]++;
        }
        int q = s.nextInt();
        while (q-- > 0) {
            int b = s.nextInt();
            int c = s.nextInt();
            int count = freq[b];
            sum -= (1L*count*b);
            freq[c] += count;
            freq[b] = 0;
            sum += (1L*count * c);
            System.out.println(sum);
        }
    }
}