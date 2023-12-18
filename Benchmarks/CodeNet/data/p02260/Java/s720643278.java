import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] element = br.readLine().split(" ");
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(element[i]);
        }
        
        int count = selectionSort(A);

        StringBuilder output = new StringBuilder("");
        for (int i = 0; i < N; i++) {
            output.append(A[i]);
            if (i != N-1) {
                output.append(" ");
            }
        }
        System.out.println(output.toString());
        System.out.println(count);
    }

    public static int selectionSort (int[] a) {
        int i, j, temp;
        int n = a.length;
        int count = 0;
        int mini;
        for (i = 0; i < n; i++) {
            mini = i;
            for (j = i; j < n; j++) {
                if (a[j] < a[mini]) {
                    mini = j;
                }
            }
            if (i != mini) {
                temp = a[i];
                a[i] = a[mini];
                a[mini] = temp;
                count++;
            }
        }
        return count;
    }
}