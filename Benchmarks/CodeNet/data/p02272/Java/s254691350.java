import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        String[] arrStr = br.readLine().split(" ");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(arrStr[i]);
        }

        int count = mergeSort(A, 0, n);
        StringBuilder sb = new StringBuilder("");
        sb.append(A[0]);
        for (int i = 1; i < n; i++) {
            sb.append(" ").append(A[i]);
        }
        sb.append("\n").append(count);
        System.out.println(sb.toString());
    }

    public static int mergeSort(int[] A, int left, int right) {
        int count = 0;
        if (left + 1 < right) {
            int mid = (left + right) / 2;
            count += mergeSort(A, left, mid);
            count += mergeSort(A, mid, right);
            count += merge(A, left, mid, right);
        }
        return count;
    }

    public static int merge(int[] A, int left, int mid, int right) {
        int n1 = mid - left;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = A[left + i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = A[mid + i];
        }

        int i = 0, j = 0;
        for (int k = left; k < right; k++) {
            if (i >= n1) {
                A[k] = R[j];
                j++;
                continue;
            } else if (j >= n2) {
                A[k] = L[i];
                i++;
                continue;
            }
            if (L[i] < R[j]) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
            }
        }

        return right - left;
    }
}