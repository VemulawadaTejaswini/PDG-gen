import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int it = Integer.parseInt(br.readLine());
        
        String str2 = br.readLine();
        String[] strarr = str2.split(" ");
        
        int[] array = new int[it];
        for(int i=0; i<it; i++) {
            array[i] = Integer.parseInt(strarr[i]);
        }
        
        trace(array, it);
        insertSort(array, it);
    }
    
    public static void trace(int[] A, int N) {
        for(int i=0; i<N-1; i++) {
            System.out.printf("%d ", A[i]);
        }
        System.out.println(A[N-1]);
    }
    
    public static void insertSort(int[] A, int N) {
        for(int i=1; i<N; i++) { 
            int v = A[i]; 
            int j = i - 1;
            while((j>=0) && (A[j]>v)) {
                A[j+1] = A[j];
                j--;
            }
            A[j+1] = v;
            trace(A, N);
        }
    
    }
}

