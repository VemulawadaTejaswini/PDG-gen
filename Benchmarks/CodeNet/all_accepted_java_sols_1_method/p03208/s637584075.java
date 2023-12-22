import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[N-1];
        for(int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int i = 1; i< N; i++) {
            b[i-1] = a[i] - a[i-1];
        }
        int min, result, minI;
        min = 2147483647;
	minI = 0;
        for(int i = 0; i < N; i++) {
            if(N < i+k) break;
            result = 0;
            for(int j = 0; j <k-1; j++) {
                result = result + b[i+j];
            }
	    if(min > result){
                min = result;
                minI = i;
            }
        }
        result = a[minI+k-1] - a[minI];
        System.out.println(result);


    }
}