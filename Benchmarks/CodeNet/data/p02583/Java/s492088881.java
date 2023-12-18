import java.util.*;

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] L = new int[N];
        for (int i = 0; i < N; i++) {L[i] = Integer.parseInt(sc.next());}
        int[][] A = nCombination3(L);

        int counter = 0;
        int a, b, c;
        for (int i = 0; i < N*(N-1)*(N-2)/6; i++) {
            a = A[i][0];
            b = A[i][1];
            c = A[i][2];
            
            if (a == b) {continue;}
            else if (b == c) {continue;}
            else if (c == a) {continue;}

            if ((Math.max(a-b, b-a) < c) && (c < a + b)) {counter++;}
            
        }


        System.out.println(counter);
    }

    private static int[][] nCombination3(int[] list) {
        int count = list.length;
        int num = 0;
        int[][] A = new int[count*(count-1)*(count-2)/6][3];

        for (int i = 0; i < count - 2; i++) {
            for (int j = i + 1; j < count - 1; j++) {
                for (int k = j + 1; k < count; k++) {
                    A[num][0] = list[i];
                    A[num][1] = list[j];
                    A[num][2] = list[k];
                    num++;
                }
            }
        }
        return A;
    }
}