import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] As = new int[N];
        int[] sortedAs = new int[N];
        for (int i=0; i<N; i++) {
            As[i] = sc.nextInt();
        }

        System.arraycopy(As, 0, sortedAs, 0, As.length);
        Arrays.sort(sortedAs);
        

        int max = sortedAs[N-1];
        
        if (max == sortedAs[N-2]) {
            for (int i=0; i<N; i++) {
                System.out.println(max);
            }
        } else {
            for (int a : As) {
                if (a == max) {
                    System.out.println(sortedAs[N-2]);
                } else {
                    System.out.println(max);
                }
            }
        }
    }
}

