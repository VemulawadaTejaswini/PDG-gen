import java.io.*;

class Main {
    
    public static int num = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int it = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String[] strarr = str.split(" ", it);
        
        int[] array = new int[it];
        for(int i=0; i<it; i++) {
            array[i] = Integer.parseInt(strarr[i]);
        }
        
        bubbleSort(array, it);
        trace(array, it);
    }
    
    static void trace(int[] A, int N) {
        for(int i=0; i<N-1; i++) {
            System.out.printf("%d ", A[i]);
        }
        System.out.println(A[N-1]);
        System.out.println(num);
    }
    
    static void bubbleSort(int[] A, int N) {
        boolean flag = true;
        while(flag) {
            int j = 0;
            flag = false;
            for(int i=N-1; i>j; i--) {
                int v = A[i];
                if(A[i] < A[i-1]) {
                    A[i] = A[i-1];
                    A[i-1] = v;
                    flag = true;
                    num++;
                }
            }
            j++;
        }
    }
    
}
